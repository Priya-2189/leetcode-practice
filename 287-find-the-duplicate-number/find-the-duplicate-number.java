class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>en:hm.entrySet())
        {
            if(en.getValue()>1)
            {
              ans=en.getKey();
            }
        }
        return ans;
    }
}