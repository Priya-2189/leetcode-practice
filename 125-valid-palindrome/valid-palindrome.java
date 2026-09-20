class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
             
            if(Character.isLetterOrDigit(Character.toLowerCase(s.charAt(i))))
            {
                  s1.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
       
            if(sb.toString().equals(s1.toString()))
            {
                return true;
            }
        return false;
    }
}