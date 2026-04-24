class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int n=moves.length();
        int cntL=0;
        int cntR=0;
        int blank=0;

        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L')cntL++;
            else if(ch=='R')cntR++;
            else blank++;

        }

        int res=Math.abs(cntL-cntR)+blank;
        return res;
        
    }
}