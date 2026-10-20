class Solution {
    public int numTilePossibilities(String tiles) {

        boolean[] used = new boolean[tiles.length()];
        Set<String> res = new HashSet<>();

        solve(tiles,used,res,new StringBuilder());

        return res.size()-1;
        
    }

    public void solve(String s , boolean[] used, Set<String> res, StringBuilder sb)
    {
        res.add(sb.toString());

        for(int i=0;i<s.length();i++)
        {
            if(used[i]==true)continue;

            used[i]=true;
            sb.append(s.charAt(i));
            solve(s,used,res,sb);
            used[i]=false;
            sb.deleteCharAt(sb.length() - 1); 
        }

    }
}