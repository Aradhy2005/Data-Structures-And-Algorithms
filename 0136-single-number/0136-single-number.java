class Solution {
    public int singleNumber(int[] nums) {

        int xorr=0;

        for(int a:nums)
        {
            xorr^=a;
        }

        return xorr;
        
    }
}