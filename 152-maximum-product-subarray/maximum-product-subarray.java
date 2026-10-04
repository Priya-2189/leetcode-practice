class Solution {
    public int maxProduct(int[] nums) 
    {
        
        int maxprod=nums[0];
        int minprod=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int oldmax=maxprod;
            int oldmin=minprod;

            maxprod=Math.max(nums[i],Math.max(oldmax*nums[i],oldmin*nums[i]));
            minprod=Math.min(nums[i],Math.min(oldmax*nums[i],oldmin*nums[i]));
            ans=Math.max(ans,maxprod);
        }
      return ans;
    }
}