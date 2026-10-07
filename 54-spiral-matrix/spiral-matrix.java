class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>al=new ArrayList<>();
        int top=0;
        int right=matrix[0].length-1;
        int left =0;
        int bottom=matrix.length-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                al.add(matrix[top][i]);
            }
            top=top+1;
            for(int j=top;j<=bottom;j++)
            {
                al.add(matrix[j][right]);
            }
            right=right-1;
             if (top <= bottom) {
            for(int j=right;j>=left;j--)
            {
                al.add(matrix[bottom][j]);
            }
             
            bottom=bottom-1;
             }
            if(left<=right)
            {
            for(int j=bottom;j>=top;j--)
            {
                al.add(matrix[j][left]);
            }
            
            left=left+1;
            }
        }
        return al;
    }
}