class Solution {
    public boolean judgeCircle(String s) {

        int u_cnt=0;
        int d_cnt=0;
        int l_cnt=0;
        int r_cnt=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')u_cnt++;
            else if(s.charAt(i)=='D')d_cnt++;
            else if(s.charAt(i)=='L')l_cnt++;
            else r_cnt++;
        }

        if(u_cnt==d_cnt && l_cnt==r_cnt)return true;

        return false;


        
    }
}