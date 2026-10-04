class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>al=new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        for(int j=1;j<=nums.length;j++)
        {
            if(freq[j]==0)
            {
                al.add(j);
            }
        }
     return al;
    }
}