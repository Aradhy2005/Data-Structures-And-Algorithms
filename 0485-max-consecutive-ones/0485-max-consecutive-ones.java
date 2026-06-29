class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max_ones=0;
        int curr_ones=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max_ones=Math.max(max_ones,curr_ones);
                curr_ones=0;
            }

            else curr_ones++;
        }

        return Math.max(max_ones,curr_ones);
        
    }
}