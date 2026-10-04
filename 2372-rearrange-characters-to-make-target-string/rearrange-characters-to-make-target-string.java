class Solution {
    public int rearrangeCharacters(String s, String target) {
      int sfreq[]=new int[26];
      int tfreq[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        sfreq[s.charAt(i)-'a']++;
      }
      int ans=Integer.MAX_VALUE;
      for(int j=0;j<target.length();j++)
      {
        tfreq[target.charAt(j)-'a']++;
      }
      for(int i=0;i<26;i++)
      {
        if(tfreq[i]>0){
           int copy=sfreq[i]/tfreq[i];
        
        ans=Math.min(ans,copy);
        }
        
      }
      return ans;
    }
}