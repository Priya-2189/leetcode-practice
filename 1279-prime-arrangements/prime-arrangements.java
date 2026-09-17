class Solution {
    public int numPrimeArrangements(int n) {
        boolean isprime[]=new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            isprime[i]=true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(isprime[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    isprime[j]=false;
                }
            }
        }
        int p=0;
        for(int i=0;i<=n;i++)
        {
                if(isprime[i])
                {
                    p++;
                }
        }
        int  np=n-p;
        long prod=1;
          int mod=1000000007;
        prod=(fact(np)*fact(p))%mod;
     return (int)prod;
        
    }
    public long fact(int x)
    {
        long facto[]=new long[x+1];
        int mod=1000000007;
        facto[0]=(long)1;
        for(int i=1;i<=x;i++)
        {
            facto[i]=(facto[i-1]*i)%mod;
        }
        return facto[x];

    }
}