class Solution {
    public String makeGood(String s) {

        StringBuilder res = new StringBuilder(s);

        for(int i=0;i<res.length()-1;i++)
        {
            if(Math.abs(res.charAt(i)-res.charAt(i+1))==32)
            {
                res.delete(i,i+2);
                i=Math.max(-1,i-2);
            }
        }

        return res.toString();
        
    }
}