class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;++i)
        {
            for(int j=i+1;j<words.length;++j)
            {
                String s1=words[i];
                String s2=words[j];
                if(isPrefix(s1,s2)&&isSuffix(s1,s2))
                {
                    c++;
                }
            }
        }
        return c;
    }
    boolean isPrefix(String a,String b )
    {
        if(a.length()>b.length())
        return false;
        for(int i=0;i<a.length();i++)
        {
                  char ch1= a.charAt(i);
                  char ch2=b.charAt(i);
                  if(ch1!=ch2)
                  {
                    return false;
                  }
        }
        return true;
         
    }
    boolean isSuffix(String a,String b )
    {
        if(a.length()>b.length())
        return false;
        int n=a.length();
        int m=b.length();
        for(int i=0;i<a.length();i++)
        {
                  char ch1= a.charAt(i);
                  char ch2=b.charAt(m-n+i);
                  if(ch1!=ch2)
                  {
                    return false;
                  }
        }
        return true;
         
    }

}