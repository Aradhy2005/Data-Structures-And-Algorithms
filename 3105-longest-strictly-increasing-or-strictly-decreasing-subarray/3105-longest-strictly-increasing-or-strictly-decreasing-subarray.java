class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int incCnt=1;
        int decCnt=1;

        for(int i=0;i<nums.length;i++)
        {
            int currCnt=1;
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]<nums[j+1])currCnt++;
                else break;
            }
            incCnt = Math.max(incCnt,currCnt);
        }

        for(int i=0;i<nums.length;i++)
        {
            int currCnt=1;
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])currCnt++;
                else break;
            }
            decCnt = Math.max(decCnt,currCnt);
        }

        return Math.max(incCnt,decCnt);
    }
}