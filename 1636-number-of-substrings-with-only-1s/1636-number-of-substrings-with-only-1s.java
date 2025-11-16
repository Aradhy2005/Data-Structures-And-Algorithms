class Solution {
    public int numSub(String s) {

        long cnt=0;
        long m=1000000007;
        long res=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='1')
            {
                cnt++;
               
            }

            else if(c=='0')
            {
                 res=res+(cnt*(cnt+1)/2)%m;
                cnt=0;
            }


        }

        res=res+(cnt*(cnt+1)/2)%m;

        return (int)res;
        
    }
}