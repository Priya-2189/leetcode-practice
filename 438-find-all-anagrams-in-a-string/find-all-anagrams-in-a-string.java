class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer>al=new ArrayList<>();
        int pfreq[]=new int[26];
        int wfreq[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }
        int left=0;
        for(int j=0;j<s.length();j++)
        {
            wfreq[s.charAt(j)-'a']++;
            if(j-left+1>p.length())
            {
                wfreq[s.charAt(left)-'a']--;
                left++;
            }
            if(j-left+1==p.length()&&Arrays.equals(pfreq,wfreq))
            {
                al.add(left);
            }
        }
        return al;
    }
}