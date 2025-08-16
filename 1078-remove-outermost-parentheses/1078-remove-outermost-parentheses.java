class Solution {
    public String removeOuterParentheses(String s) {

        String res="";
        int opencnt=0;

        for(char ch: s.toCharArray())
        {

            if(ch=='(')
            {
                if(opencnt>0)
                res+=ch;

                opencnt++;
            }

            else if(ch==')')
            {
                opencnt--;

                if(opencnt>0)
                res+=ch;
            }
        }

        return res;
        
    }
}