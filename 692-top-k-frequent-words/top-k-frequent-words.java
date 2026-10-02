class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String,Integer>hm=new TreeMap<>();
       
        for(int i=0;i<words.length;i++)
        {
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }
         ArrayList<String>al=new ArrayList<>(hm.keySet());
        Collections.sort(al, new Comparator<String>() {
            public int compare(String a, String b) {

                if (hm.get(a) != hm.get(b)) {
                    return hm.get(b) - hm.get(a);
                }

                return a.compareTo(b);
            }
        });
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(al.get(i));
        }
        return ans;

    }
}