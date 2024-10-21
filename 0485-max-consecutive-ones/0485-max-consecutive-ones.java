class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int temp=0;
        int max=0;

        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            temp++;

            else
            temp=0;

            max=Math.max(max,temp);

        }

        return max;
    }
}