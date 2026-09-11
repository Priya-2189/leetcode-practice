class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    al.add(i);
                    al.add(j);
                }
            }
        }
        int[]arr=new int[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}