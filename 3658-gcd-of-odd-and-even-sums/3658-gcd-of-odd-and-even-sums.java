class Solution {
    public int gcdOfOddEvenSums(int n) {

        //sum of first n odd = n^2
        //sum of first n even = n*(n+1)

        int sumOdd=n*n;
        int sumEven=n*(n+1);
        return gcd(sumOdd,sumEven);
        
    }

    public int gcd(int a,int b)
    {
        if(b==0)return a;

        return gcd(b,a%b);
    }
}