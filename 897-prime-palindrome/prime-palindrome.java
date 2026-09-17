class Solution {
    public int primePalindrome(int n) {
         if(n>=8&&n<=11)
         {
            return 11;
         }
         for(int i=1; ;i++)
         {
            String s=Integer.toString(i);
            StringBuilder sb=new StringBuilder(s);
            for(int j=s.length()-2;j>=0;j--)
            {
                sb.append(s.charAt(j));
            }
            int num=Integer.parseInt(sb.toString());
            if(num>=n&&isPrime(num))
            {
                return num;
            }

         }
    }
    boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}