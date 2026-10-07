
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans[] = new int[n * m];
        int k = 0;

        for(int i = 0; i < n + m - 1; i++)
        {
            if(i % 2 == 0)
            {
                for(int j = n - 1; j >= 0; j--)
                {
                    int col = i - j;

                    if(col >= 0 && col < m)
                    {
                        ans[k] = mat[j][col];
                        k++;
                    }
                }
            }
            else
            {
                for(int j = 0; j < n; j++)
                {
                    int col = i - j;

                    if(col >= 0 && col < m)
                    {
                        ans[k] = mat[j][col];
                        k++;
                    }
                }
            }
        }

        return ans;
    }
}

