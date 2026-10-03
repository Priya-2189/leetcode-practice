class Solution {
    public String decodeString(String s) {
        Stack<String>ch=new Stack<>();
        Stack<Integer>n=new Stack<>();
        int num=0;
        String curr="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                num=num*10+s.charAt(i)-'0';
            }
            else if(s.charAt(i)=='[')
            {
                ch.push(curr);
                n.push(num);
                num = 0;
                curr= "";


            }
            else if(s.charAt(i)==']')
            {
                int k=n.pop();
                String prev=ch.pop();
                String temp = curr;
                  curr = "";
                for(int j=0;j<k;j++)
                {
                    curr=curr+temp;
                }
                curr=prev+curr;
            }
            else
            {
                curr=curr+s.charAt(i);
            }
        }
        return curr;
    }
}