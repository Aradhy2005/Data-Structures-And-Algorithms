class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0)return 0;

        int maxLen=1;

        for(int i=0;i<s.length();i++)
        {
            HashSet<Character> st=new HashSet<>();
            for(int j=i;j<s.length();j++)
            {
                if(!st.contains(s.charAt(j)))
                {
                    maxLen=Math.max(maxLen,j-i+1);
                    st.add(s.charAt(j));


                }

                else break;
            }
        }

        return maxLen;
        

    }
}