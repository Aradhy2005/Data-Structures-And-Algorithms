class Solution {
    public int myAtoi(String s) {

        s=s.trim();
        if(s.length()==0)return 0;
        int i=0;
        int sign=1;
        long nums=0;
        
       if(s.charAt(0)=='-')
            {
                sign=-1;
                i++;
            }
            else if(s.charAt(0)=='+'){
                sign=1;
                i++;
            } 

        for(int j=i;j<s.length();j++)
        {
            if(Character.isDigit(s.charAt(j)))
            {
                 

                nums=nums*10+(s.charAt(j)-'0');
                if((nums*sign)>Integer.MAX_VALUE) return Integer.MAX_VALUE;

                else if((nums*sign)<Integer.MIN_VALUE)return Integer.MIN_VALUE;

            }
            else break;
        }

       


        return (int)nums*sign;


        
    }
}