class Solution {
    public int smallestNumber(int n) {

        if(n==1)return n;
        if(n==0)return n;

        n++;

        while(true)
        {
            if((n&(n-1))==0)return (n-1);

            n++;
        }
        
    }
}