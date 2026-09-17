class Solution {
    public boolean primeSubOperation(int[] nums) {
        int maxele=getMax(nums);
        boolean sieve[]=new boolean[maxele+1];
        
        for(int i=0;i<sieve.length;i++)
        {
            sieve[i]=true;
        }
        sieve[1]=false;
        for(int i=2;i<=Math.sqrt(maxele);i++)
        {
           if(sieve[i])
           {
            for(int j=i*i;j<maxele;j+=i)
            {
              sieve[j]=false;

            }
           }
        }
        int curr=1;
        int i=0;
        while(i<nums.length)
        {
            int diff=nums[i]-curr;
            if(diff<0)
            {
                return false;
            }
            if(sieve[diff]==true||diff==0)
            {
                i++;
                curr++;
            }
            else
            {
                curr++;
            }
        }
        return true;
    }
    public int getMax(int n[])
    {
        int max=-1;
        for(int num:n)
        {
            if(num>max)
            {
                max=num;
            }
        }
        return max;
    }

}