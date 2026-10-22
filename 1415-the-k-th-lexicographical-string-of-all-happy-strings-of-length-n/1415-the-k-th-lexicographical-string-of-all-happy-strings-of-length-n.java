class Solution {
    public String getHappyString(int n, int k) {

        List<String> res = new ArrayList<>();
        solve(n,res,new StringBuilder());
        if(res.size()<k) return "";

        return res.get(k-1);
    }

    public void solve(int n,List<String> res,StringBuilder sb)
    {
        if(sb.length()==n)
        {
            res.add(sb.toString());
            return;
        }

        for(char ch='a';ch<='c';ch++)
        {
            if(!sb.isEmpty() && sb.charAt(sb.length()-1)==ch)continue;

            sb.append(ch);
            solve(n,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}