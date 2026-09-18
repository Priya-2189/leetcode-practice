class Solution {
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i+=2*k)
        {
            int j=i;
            int n=Math.min(i+k-1,ch.length-1);
            while(j<n)
            {
                char temp=ch[j];
                ch[j++]=ch[n];
                ch[n--]=temp;
            }
        }
        return new String(ch);
    }
}