class Solution {
    public String longestCommonPrefix(String[] strs) {
     if(strs == null||strs.length==0)
     {
        return "";
     }
     char ch[]=strs[0].toCharArray();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<ch.length;i++)
     {
        for(int j=1;j<strs.length;j++)
        {
            
            if(i>=strs[j].length()||strs[j].charAt(i)!=ch[i])
            {
                return sb.toString();
            }
            
        }
        sb.append(ch[i]);
     }
     return sb.toString();

     

        
    }
}