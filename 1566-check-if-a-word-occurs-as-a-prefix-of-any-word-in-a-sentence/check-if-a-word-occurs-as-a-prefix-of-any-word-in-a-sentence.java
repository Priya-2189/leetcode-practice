class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int n=sentence.length();
        
        String []ch1=sentence.split(" ");
        

        for(int i=0;i<ch1.length;i++)
        {
           
           if(ch1[i].length()>=searchWord.length()&&
           ch1[i].substring(0,searchWord.length()).equals(searchWord))
           return i+1;
        }
        return -1;
    }
}