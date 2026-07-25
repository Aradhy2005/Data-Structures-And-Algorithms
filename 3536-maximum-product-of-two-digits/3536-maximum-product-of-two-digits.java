class Solution {
    
    public int maxProduct(int n) {

        int maxRes=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;;
        int sLargest=Integer.MIN_VALUE;

        while(n!=0)
        {
            int r=n%10;
            if(r>=largest)
            {
                sLargest=largest;
                largest=r;
            }

            else if(r>sLargest)sLargest=r;

            n=n/10;
        }

        return largest*sLargest;
        
    }
}