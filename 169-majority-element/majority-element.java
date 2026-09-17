class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>en:hm.entrySet())
        {
            if(en.getValue()>n/2)
            {
                return en.getKey();
            }
        }
        return -1;
        
    }
}