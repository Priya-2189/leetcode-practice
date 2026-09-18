class Solution {
    public String mergeAlternately(String word1, String word2) {
        boolean flag=true;
        StringBuilder sb=new StringBuilder();
        int n=word1.length();
        int m=word2.length();
         int i1 = 0, i2 = 0;
        for(int i=0;i<n+m;i++)
        {
            if(flag)
            {
                if(i1<n)
                 sb.append(word1.charAt(i1++));
                else 
                    sb.append(word2.charAt(i2++));
                 
                  flag=false;
            }
            else
            { 
                if(i2<m)
                  sb.append(word2.charAt(i2++));
                else 
                    sb.append(word1.charAt(i1++));
                  
                  flag=true;
            }
        }
        return sb.toString();
    }
}