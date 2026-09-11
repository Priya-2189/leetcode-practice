class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s1=new String(ch);
            if(!hm.containsKey(s1))
            {
                hm.put(s1,new ArrayList<>());
            }
            hm.get(s1).add(strs[i]);
        }
       return  new ArrayList<>(hm.values());
       

    }
}