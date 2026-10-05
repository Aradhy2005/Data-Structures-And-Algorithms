class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st= new Stack<>();
        st.add(0);

        for(char c : s.toCharArray()){
            if(c=='(')
            {
                st.push(0);
            }

            else
            {
                int inner = st.pop();
                int curr = st.pop(); 

                int addScore = (inner==0)?1:2*inner;

                st.push(curr+addScore);
            }
        } 

        return st.pop();       
    }
}