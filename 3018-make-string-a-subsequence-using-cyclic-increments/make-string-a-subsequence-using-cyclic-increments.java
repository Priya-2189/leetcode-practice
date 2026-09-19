class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length()&&j<str2.length())
        {
            char ch1=str1.charAt(i);
            char next=(char)((ch1-'a'+1)%26+'a');
            if(ch1==str2.charAt(j)||next==str2.charAt(j))
            {
                j++;
            }
            i++;
        }
        return j==str2.length();
    }
}