class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0)return 0;

        int maxLen=1;

        for(int i=0;i<s.length();i++)
        {
            HashSet<Character> st=new HashSet<>();
            String res="";
            for(int j=i;j<s.length();j++)
            {
                if(!st.contains(s.charAt(j)))
                {
                    res+=s.charAt(j);
                    maxLen=Math.max(maxLen,res.length());
                    st.add(s.charAt(j));


                }

                else break;
            }
        }

        return maxLen;
        

    }
}