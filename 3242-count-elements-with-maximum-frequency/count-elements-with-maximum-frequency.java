class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>en:hm.entrySet())
        {
            if(en.getValue()>=1)
            {
                max=Math.max(max,en.getValue());
            }
        }

        for(Map.Entry<Integer,Integer>en:hm.entrySet())
        {
            if(en.getValue()==max)
            {
                c+=en.getValue();
            }
        }
        return c;
    }
}