class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                st.push(s.charAt(i));
            }
            else if(ch==')'||ch=='}'||ch==']')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char top=st.peek();
                if(ch==')'&&top=='(')
                {
                    st.pop();
                }
                else if(ch==']'&&top=='[')
                {
                    st.pop();
                }
                else if(ch=='}'&&top=='{')
                {
                    st.pop();
                }
                else
                {
                   return false;
                }

            }
            
        }
        if(st.size()==0)
        {
            return true;
        }
        return false;
    }
}