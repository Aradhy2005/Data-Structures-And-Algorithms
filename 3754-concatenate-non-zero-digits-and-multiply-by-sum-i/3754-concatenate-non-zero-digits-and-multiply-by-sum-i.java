class Solution {
    public long sumAndMultiply(int n) {

        long sum=0;

        long temp=n;
        long x=0;

        while(temp!=0)
        {
            long dig=temp%10;
            if(dig!=0)
            {
                sum+=dig;
                x=x*10+dig;

            }
            temp=temp/10;
        }
        temp=x;
        x=0;


        while(temp!=0)
        {
            x=x*10+(temp%10);
            temp=temp/10;
        }

        return x*sum;
        
    }
}