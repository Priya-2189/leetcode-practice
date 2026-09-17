class Solution {
    boolean isprime[];

    public int[] closestPrimes(int left, int right) {
        isprime=new boolean[right+1];
       
        for(int i=2;i<=right;i++)
        {
            isprime[i]=true;
        }
        for(int i=2;i*i<=right;i++)
        {
            if(isprime[i])
            {
                for(int j=i*i;j<=right;j+=i)
                {
                    isprime[j]=false;
                }
            }
        }
       
     ArrayList<Integer>al=new ArrayList<>();
     for(int i=left;i<=right;i++)
     {
        if(isPrime(i))
        {
            al.add(i);
        }
        
     }  
     
     int ans[]=new int[2];
     ans[0]=-1;
     ans[1]=-1;
     if(al.size()<2)
     {
        return  ans;
     } 
     int min=Integer.MAX_VALUE;
     for(int i=1;i<al.size();i++)
     {
        int diff=al.get(i)-al.get(i-1);
       
        if(diff<min)
        {
             min=diff;
            ans[1]=al.get(i);
            ans[0]=al.get(i-1);
        }
     }
     return ans;
    }
    public boolean isPrime(int l)
    {
        return isprime[l];
    }
    

}