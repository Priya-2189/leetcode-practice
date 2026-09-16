class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=nums.length-1;
        
        for(int k=0;k<n;k++)
        {
            int suml=0;
           int sumr=0;
          
            for(int i=0;i<k;i++)
            {
                suml+=nums[i];
            }
            for(int j=k+1;j<n;j++)
            {
              sumr+=nums[j];
            }
            if(suml==sumr)
            {
                return k;
            }
        }
        return -1;

    }
}