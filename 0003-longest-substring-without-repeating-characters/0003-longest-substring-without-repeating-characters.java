class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> st=new HashSet<>();
        int left=0;

        int maxLen=0;

        for(int right=0;right<s.length();right++)
        {
            while(st.contains(s.charAt(right)))
            {
                st.remove(s.charAt(left));
                left++;
            }

            maxLen=Math.max(maxLen,right-left+1);

            st.add(s.charAt(right));
        }

        return maxLen;
        
    }
}