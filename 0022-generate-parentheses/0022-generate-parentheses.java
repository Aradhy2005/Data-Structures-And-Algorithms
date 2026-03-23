class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        solve(n,"",0,0);
        return ans;
    }

    public void solve(int n,String curr,int open,int close)
    {
        if(curr.length()==2*n)
        {
            ans.add(curr);
            return;
        }

        if(open<n)
        {
            curr+='(';
            solve(n,curr,open+1,close);
            curr=curr.substring(0,curr.length()-1);
        }

        if(close<open)
        {
            curr+=')';
            solve(n,curr,open,close+1);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}