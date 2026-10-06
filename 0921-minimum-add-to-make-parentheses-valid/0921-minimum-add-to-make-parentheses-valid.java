class Solution {
    public int minAddToMakeValid(String s) {

        int set = 0;
        int res=0;

        for(char ch:s.toCharArray())
        {
            if(ch=='(')set+=1;
            else if(ch==')')set-=1;

            if(set==-1)
            {
                set+=1;
                res+=1;
            }
        }

        return set+res;
        
    }
}