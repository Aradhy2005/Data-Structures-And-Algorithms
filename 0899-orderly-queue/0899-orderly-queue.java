class Solution {
    public String orderlyQueue(String s, int k) {

        if(k>1)
        {
            char[] wrd = s.toCharArray();
            Arrays.sort(wrd);
            return String.valueOf(wrd);
        }

        String res = s;

        for(int l=1;l<s.length();l++){
            String temp = s.substring(l)+s.substring(0,l);

            if(temp.compareTo(res)<0)
            res = temp;
        }

return res;
        
    }
}