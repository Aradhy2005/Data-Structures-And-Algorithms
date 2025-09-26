class Solution {
    public int minBitFlips(int start, int goal) {

        int xorr=start^goal;

        int cnt=0;

        for(int i=0;i<32;i++)
        {
            cnt+=(xorr&1);

            xorr=xorr>>1;
        }

        return cnt;
        
    }
}