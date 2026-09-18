class Solution {
    int max=0;
    public int maxLength(List<String> arr) {
      

        backtrack(arr,0,"");
        return max;
    }
    void backtrack (List<String>arr,int index,String curr)
    {
        if(!isUnique(curr))
        {
            return;        }
        max=Math.max(max,curr.length());
        for(int i=index;i<arr.size();i++)
        {
            backtrack(arr,i+1,curr+arr.get(i));
        }
    }
    boolean isUnique(String s)
    {
        int freq[]=new int[26];
        char ch[]=s.toCharArray();
        for(char c:ch)
        {
            freq[c-'a']++;
            if(freq[c-'a']>1)
            {
                return false;
            }
        }
        return true;
    }
}