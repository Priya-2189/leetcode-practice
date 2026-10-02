class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>al=new ArrayList<>();
        solve(al,"",0,0,n);
        return al;
    }
    public void solve(List<String>al,String s,int open,int close,int n)
    {
        if(s.length()==2*n)
        {
            al.add(s);
            return ;
        }
        if(open<n)
        {
            solve(al,s+"(",open+1,close,n);
        }
        if(close<open)
        {
            solve (al,s+')',open,close+1,n);
        }
    }
}