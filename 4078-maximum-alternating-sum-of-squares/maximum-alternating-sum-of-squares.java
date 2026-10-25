class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long []sqrr=new long [n];
        for(int i=0;i<nums.length;i++)
        {
            sqrr[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(sqrr);
        long ans = 0;
        int pos=(n+1)/2;
        for(int j=n-1;j>=n-pos;j--)
        {
            ans+=sqrr[j];
        }
        for(int j=0;j<n-pos;j++)
        {
            ans-=sqrr[j];
        }
     return ans;
    }
}