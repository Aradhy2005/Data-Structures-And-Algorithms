class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean[] dp = new Boolean[s.length()+1];

        return solve(0,s,wordDict,dp);
    }

    boolean solve(int idx,String s , List<String> wordDict,Boolean[] dp)
    {
        if(idx==s.length())return true;

        if(dp[idx]!=null)return dp[idx];

        for(int i=idx+1;i<=s.length();i++)
        {
            String sub = s.substring(idx,i);

            if(wordDict.contains(sub) && solve(i,s,wordDict,dp))
            return dp[idx]=true;
        }

        return dp[idx]=false;
    }
}