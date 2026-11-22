class Solution {
    public boolean checkString(String s) {

        int idx_b = s.indexOf('b');
        if(idx_b==-1)return true;

        for(int i=idx_b;i<s.length();i++)
        {
            if(s.charAt(i)=='a')return false;
        }

        return true;
        
    }
}