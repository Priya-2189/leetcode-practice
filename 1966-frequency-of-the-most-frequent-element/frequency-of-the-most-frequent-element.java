class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int ans=0;
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int tar=nums[i];
            int ws=i-left+1;
            long cost=(long) tar*ws-sum;
            while(cost>k)
            {
                sum-=nums[left];
                left=left+1;

                ws=i-left+1;
                cost=(long) tar*ws-sum;
               
            }
             ans=Math.max(ans,ws);
        }
    
    return ans;
    }
}