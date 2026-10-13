class Solution {
    int max_cnt=0;
    public int maxUniqueSplit(String s) {

        Set<String> st = new HashSet<>();
        int curr_cnt=0;
        solve(0,s,curr_cnt,st);
        return max_cnt;      
    }

    public void solve(int i,String s,int curr,Set<String> st)
    {
        if(i>=s.length())
        {
            max_cnt = Math.max(max_cnt,curr);
            return;
        }


        if(curr+(s.length()-i)<=max_cnt)return;

        for(int j=i;j<s.length();j++)
        {
            String sub = s.substring(i,j+1);

            if(!st.contains(sub))
            {
                st.add(sub);
                solve(j+1,s,curr+1,st);
                st.remove(sub);
            }
        }
    }
}