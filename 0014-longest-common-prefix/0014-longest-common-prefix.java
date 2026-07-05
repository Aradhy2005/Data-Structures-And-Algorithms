class Solution {
    public String longestCommonPrefix(String[] strs) {

        String res = "";
        int idx=0;

        Arrays.sort(strs);

        String first=strs[0];
        String last=strs[strs.length-1];

        while(idx<first.length() && idx<last.length())
        {
            if(first.charAt(idx)==last.charAt(idx))idx++;

            else break;
        }

        return first.substring(0,idx);
        
    }
}