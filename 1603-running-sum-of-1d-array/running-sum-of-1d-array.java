class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        int n=nums.length;
        arr[0]=nums[0];
        int sum=0;
        sum+=arr[0];
        for(int i=1;i<n;i++)
        {
          sum+=nums[i];
          arr[i]=sum;
        }
        return arr;
    }
}