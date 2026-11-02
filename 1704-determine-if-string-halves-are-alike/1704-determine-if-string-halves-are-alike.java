class Solution {
    public boolean halvesAreAlike(String s) {

        String vowel = "aeiouAEIOU";
        int countL=0;
        int countR=0;

        for(int i=0;i<s.length();i++)
        {
            if(i<s.length()/2 && vowel.contains(s.charAt(i)+""))countL++;

            else if(i>=s.length()/2 && vowel.contains(s.charAt(i)+""))countR++;
        }

        return countL==countR;
        
    }
}