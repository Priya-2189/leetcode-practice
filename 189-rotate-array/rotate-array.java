class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
       /*  ArrayList<Integer>al=new ArrayList<>();
        for(int i=n-k;i<n;i++)
        {
            al.add(nums[i]);
        }
        for(int i=0;i<n-k;i++)
        {
            al.add(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=al.get(i);
        } */
    }
    public void reverse(int []nums,int l,int r)
    {
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}