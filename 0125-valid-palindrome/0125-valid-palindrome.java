class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();
        String temp="";
        for(int i=0;i<s.length();i++)
        {
           if(Character.isLetterOrDigit(s.charAt(i)))temp+=s.charAt(i);
        }

        int low=0;
        int high=temp.length()-1;

        while(low<=high)
        {
            if(temp.charAt(low)!=temp.charAt(high))return false;

            low++;
            high--;
        }

        return true;
    }
        
}