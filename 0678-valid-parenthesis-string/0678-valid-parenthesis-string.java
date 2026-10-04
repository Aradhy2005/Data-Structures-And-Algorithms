class Solution {
    public boolean checkValidString(String s) {

        Boolean[][] dp = new Boolean[101][101];

        return solve(s,0,0,dp);
        
    }

    public boolean solve(String s, int i, int cnt,Boolean[][] dp)
    {
        if(cnt<0)return false;

        if(i==s.length())return (cnt==0);

        if(dp[i][cnt]!=null)return dp[i][cnt];

        if(s.charAt(i)=='(')return dp[i][cnt]=solve(s,i+1,cnt+1,dp);

        else if(s.charAt(i)==')')return dp[i][cnt]=solve(s,i+1,cnt-1,dp);

        else
        {
            return dp[i][cnt]=solve(s,i+1,cnt,dp) || solve(s,i+1,cnt+1,dp) || solve(s,i+1,cnt-1,dp);
        }
    }
}