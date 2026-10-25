class Solution {
        int dr[]={1,-1,0,0};
        int dc[]={0,0,-1,1};
        int m,n;
    public int closedIsland(int[][] grid) {
        
        m=grid.length;
         n=grid[0].length;
        int count=0;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0&&!vis[i][j])
                {
                  if(dfs(i,j,vis,grid))
                  {
                    count++;
                  }
                }
            }
        }
        return count;
        
    }
    public boolean dfs(int r,int c,boolean vis[][],int grid[][])
    {
       if(r<0 || c<0 || r>=m || c>=n)
{
    return false;
}

        if(grid[r][c]==1||vis[r][c])
        {
            return true;
        }
        vis[r][c]=true;
        boolean closed=true;
        for(int i=0;i<4;i++)
        {
            int nr=r+dr[i];
            int nc=c+dc[i];
            if(!dfs(nr,nc,vis,grid))
            {
                closed=false;
            }
        }
        return closed;
    }
}