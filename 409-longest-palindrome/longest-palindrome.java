class Solution {
    public int longestPalindrome(String s) {
        if(s.length()<=1)
        {
            return 1;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        boolean odd=false;
        int c=0;
        for(int value:hm.values())
        {
            c+=(value/2)*2;
           if(value%2==1)
           {
             odd=true;
           } 
        }
        if(odd)
        {
            c++;
        }
        return c;
    }
}