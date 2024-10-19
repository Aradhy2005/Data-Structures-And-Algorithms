class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;

        int cnt=0;

        for(int i=0 ; i<nums.length ;i++)
        {
            if(nums[i]==0)
            cnt++;
        }

        for(int i=0 ; i<nums.length ;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }

        for(int i=nums.length-1 ; cnt>0 ;i--)
        {
            nums[i]=0;
            cnt--;
        }
        
    }
}