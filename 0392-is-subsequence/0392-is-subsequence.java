class Solution {
    public boolean isSubsequence(String s, String t) {

        int prev_found=-1;
        int cnt=0;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            for(int j=0;j<t.length();j++)
            {
                if(t.charAt(j)==ch && j>prev_found)
                {
                    prev_found=j;
                    cnt++;
                    break;
                }
            }
        }

        return cnt==s.length();
    }
}