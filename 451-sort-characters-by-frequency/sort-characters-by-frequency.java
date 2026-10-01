class Solution {
    public String frequencySort(String s) {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int max=0;
        for(int freq:hm.values())
        {
            max=Math.max(max,freq);
        }
        StringBuilder sb=new StringBuilder();
        for(int f=max;f>=1;f--)
        {
        for(Map.Entry<Character,Integer>en:hm.entrySet())
        {
            if(en.getValue()==f)
            {
                for(int j=0;j<f;j++)
                {
                  sb.append(en.getKey());
                }
            }
           
        }
        }
        return sb.toString();
    }
}