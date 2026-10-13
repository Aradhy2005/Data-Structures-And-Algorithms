class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }

        long res=0;

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(i>=nums.length/2)
            {
                res+=nums[i];
            }

            else
            res-=nums[i];
        }


        return res;
        
    }
}