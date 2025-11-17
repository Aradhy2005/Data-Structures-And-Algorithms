class Solution {
    public int numSub(String s) {
        long res=0;
        long cnt=0;
        int m=1000000007;

        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='1')
            {
                cnt++;
                res=(res+cnt)%m;
            }

            else
            cnt=0;
        }

        return (int)res;
        
    }
}