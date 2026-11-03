class Solution {
    public int minMoves(int[] nums) {

        int res=0;
        int max = 0;
        for(int num:nums)max = Math.max(num,max);

        for(int num:nums)
        {
            if(num!=max)
            {
                res+=(max-num);
            }
        }

        return res;
        
    }
}