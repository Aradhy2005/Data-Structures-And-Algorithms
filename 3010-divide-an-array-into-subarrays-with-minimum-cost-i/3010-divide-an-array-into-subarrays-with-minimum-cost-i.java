class Solution {
    public int minimumCost(int[] nums) {

        int sum=nums[0];
        int small=Integer.MAX_VALUE;
        int nsmall=99999999;


        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<small)
            {
                nsmall=small;
                small=nums[i];
            }

            else if(nums[i]<nsmall)
            {
                nsmall=nums[i];
            }

        }

        sum+=nsmall+small;

        return sum;
        
    }
}