class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++)
        {
            int[] ch= new int[255];
            for(int j=i;j<s.length();j++)
            {
                if(ch[s.charAt(j)]==1) break;

                maxLen=Math.max(maxLen,j-i+1);

                ch[s.charAt(j)]=1;


            }


        }

        return maxLen;
        
    }
}