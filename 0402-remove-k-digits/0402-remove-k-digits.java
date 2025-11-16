class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st=new Stack<>();

        if(num.length()==k)return "0";

        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty() && st.peek()>num.charAt(i) &&k!=0)
            {
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while(k>0)
        {
            st.pop();
            k--;
        }

      StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        // Remove leading zeros manually
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0')
            idx++;

        // If everything removed or only zeros → return 0
        if (idx == sb.length()) return "0";

        return sb.substring(idx);
        
    }
}