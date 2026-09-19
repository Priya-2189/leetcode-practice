class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int i=0, j=k-1;
         char ch[]=s.toCharArray();
           
            while(i<j)
            {
             char temp=ch[i];
             ch[i]=ch[j];
             ch[j]=temp;
             i++;
             j--;
            }
        
        return String.valueOf(ch);
    }
}