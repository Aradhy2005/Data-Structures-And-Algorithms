class Solution {
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }

            else return(isPalin(s,i+1,j)||isPalin(s,i,j-1));
        }

        return true;

        
        
    }

    public boolean isPalin(String s,int low,int high) {
        

        while(low<=high)
        {
            if(s.charAt(low)!=s.charAt(high))return false;

            low++;
            high--;
        }

        return true;
    }
}