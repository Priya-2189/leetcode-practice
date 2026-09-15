class Solution {
    public int findNumbers(int[] nums) {
        int  n=nums.length;
        int c=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
           int digi=nums[i];
           while(digi>0)
           {
            digi=digi/10;
            c++;
           }
           if(c%2==0)
           {
            ans++;
           }
           c=0;
           
        }
        return ans;
    }
}