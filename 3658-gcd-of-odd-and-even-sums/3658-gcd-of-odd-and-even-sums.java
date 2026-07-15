class Solution {
    public int gcdOfOddEvenSums(int n) {

        //sum of first n odd = n^2
        //sum of first n even = n*(n+1)

        int sumOdd=n*n;
        int sumEven=n*(n+1);
        int GCD=1;

        for(int i=1;i<sumOdd && i<sumEven;i++)
        {
            if(sumOdd%i==0 && sumEven%i==0)
            GCD=i;
        }

        return GCD;
        
    }
}