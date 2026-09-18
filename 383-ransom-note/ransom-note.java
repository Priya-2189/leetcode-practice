class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=ransomNote.charAt(i);
            freq1[ch-'a']++;
        }
        for(int i=0;i<m;i++)
        {
            char c=magazine.charAt(i);
            freq2[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq1[i]>freq2[i])
            {
                return false;
            }
        }
        return true;
        
    }
}