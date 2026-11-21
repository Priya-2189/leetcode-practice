import java.util.*;

class Solution {
    List<Integer>[] tree;
    int[] ans, last;
    String s;

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n = parent.length;
        this.s = s;

        tree = new ArrayList[n];
        ans = new int[n];
        last = new int[26];

        Arrays.fill(last, -1);
        Arrays.fill(ans, 1);

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        dfs(0, parent);
        return ans;
    }

    void dfs(int node, int[] parent) {
        int c = s.charAt(node) - 'a';
        int prev = last[c];

        last[c] = node;

        for (int child : tree[node]) {
            dfs(child, parent);
        }

        last[c] = prev;

        if (node != 0) {
            int p = prev != -1 ? prev : parent[node];
            ans[p] += ans[node];
        }
    }
}