class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in=1;
        int d=1;
        int maxlen=1;
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]>nums[i-1])
           {
            in++;

           }
           else
           {
            in=1;
           }
           
            if(nums[i]<nums[i-1])
            {
                d++;

            }
            else
            {
                d=1;
            }
            maxlen=Math.max(maxlen,Math.max(in,d));
        }
        
        return maxlen;
    }
}