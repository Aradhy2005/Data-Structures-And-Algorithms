class Solution {
    public void moveZeroes(int[] nums) {

        int fitpos = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[fitpos] = nums[i];
                fitpos++;
            }
        }

        while(fitpos<nums.length)
        {
            nums[fitpos++]=0;
        }
        
    }
}