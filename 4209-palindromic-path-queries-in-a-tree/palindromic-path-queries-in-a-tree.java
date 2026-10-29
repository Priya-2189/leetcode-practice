import java.util.*;

class Solution {

    List<Integer>[] graph;
    int[] parent, depth, heavy, head, pos, size;
    int curPos;

    class SegmentTree {
        int n;
        int[] tree;

        SegmentTree(int[] arr) {
            n = arr.length;
            tree = new int[4 * n];
            build(1, 0, n - 1, arr);
        }

        void build(int node, int l, int r, int[] arr) {
            if (l == r) {
                tree[node] = arr[l];
                return;
            }
            int mid = (l + r) / 2;
            build(node * 2, l, mid, arr);
            build(node * 2 + 1, mid + 1, r, arr);
            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }

        void update(int node, int l, int r, int idx, int val) {
            if (l == r) {
                tree[node] = val;
                return;
            }
            int mid = (l + r) / 2;
            if (idx <= mid)
                update(node * 2, l, mid, idx, val);
            else
                update(node * 2 + 1, mid + 1, r, idx, val);

            tree[node] = tree[node * 2] ^ tree[node * 2 + 1];
        }

        void update(int idx, int val) {
            update(1, 0, n - 1, idx, val);
        }

        int query(int node, int l, int r, int ql, int qr) {
            if (qr < l || r < ql)
                return 0;
            if (ql <= l && r <= qr)
                return tree[node];

            int mid = (l + r) / 2;
            return query(node * 2, l, mid, ql, qr)
                    ^ query(node * 2 + 1, mid + 1, r, ql, qr);
        }

        int query(int l, int r) {
            return query(1, 0, n - 1, l, r);
        }
    }

    void dfs(int u, int p) {
        parent[u] = p;
        size[u] = 1;
        heavy[u] = -1;
        int max = 0;

        for (int v : graph[u]) {
            if (v == p)
                continue;
            depth[v] = depth[u] + 1;
            dfs(v, u);
            size[u] += size[v];

            if (size[v] > max) {
                max = size[v];
                heavy[u] = v;
            }
        }
    }

    void decompose(int u, int h) {
        head[u] = h;
        pos[u] = curPos++;

        if (heavy[u] != -1)
            decompose(heavy[u], h);

        for (int v : graph[u]) {
            if (v != parent[u] && v != heavy[u])
                decompose(v, v);
        }
    }

    int queryPath(int u, int v, SegmentTree st) {
        int res = 0;

        while (head[u] != head[v]) {
            if (depth[head[u]] < depth[head[v]]) {
                int t = u;
                u = v;
                v = t;
            }

            res ^= st.query(pos[head[u]], pos[u]);
            u = parent[head[u]];
        }

        if (depth[u] > depth[v]) {
            int t = u;
            u = v;
            v = t;
        }

        res ^= st.query(pos[u], pos[v]);

        return res;
    }

    public List<Boolean> palindromePath(int n, int[][] edges, String s, String[] queries) {

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        parent = new int[n];
        depth = new int[n];
        heavy = new int[n];
        head = new int[n];
        pos = new int[n];
        size = new int[n];

        dfs(0, -1);
        decompose(0, 0);

        char[] arr = s.toCharArray();

        int[] base = new int[n];
        for (int i = 0; i < n; i++) {
            base[pos[i]] = 1 << (arr[i] - 'a');
        }

        SegmentTree st = new SegmentTree(base);

        List<Boolean> ans = new ArrayList<>();

        for (String q : queries) {

            String[] parts = q.split(" ");

            if (parts[0].equals("update")) {

                int u = Integer.parseInt(parts[1]);
                char c = parts[2].charAt(0);

                arr[u] = c;
                st.update(pos[u], 1 << (c - 'a'));

            } else {

                int u = Integer.parseInt(parts[1]);
                int v = Integer.parseInt(parts[2]);

                int mask = queryPath(u, v, st);

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }
}