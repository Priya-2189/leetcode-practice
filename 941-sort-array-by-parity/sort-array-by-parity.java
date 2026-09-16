class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int a1[]=new int[nums.length];
        int n=nums.length;
        int l=0;
        int h=n-1;

       for(int i=0;i<n;i++)
       {
            if(nums[i]%2==0)
            {
                a1[l]=nums[i];
                l++;

            }
            else
            {
                a1[h]=nums[i];
                h--;
            }
        }
        return a1;
    }
}