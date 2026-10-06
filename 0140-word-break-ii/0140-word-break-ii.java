class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

        solve(0,curr,res,s,wordDict);

        return res;
        
    }

    public void solve(int i , StringBuilder curr , List<String> res , String s , List<String> wordDict)
    {
        if(i >= s.length())
        {
            res.add(curr.toString().trim());
            return;
        }

        for(int j = i + 1; j <= s.length(); j++)
        {
            String temp = s.substring(i, j);
            if(wordDict.contains(temp))
            {
                int oldLength = curr.length(); 
                if (curr.length() > 0) {
                    curr.append(" ");
                }
                curr.append(temp);
                
                solve(j, curr, res, s, wordDict);
                
                curr.setLength(oldLength);
            }

        }
    }
}