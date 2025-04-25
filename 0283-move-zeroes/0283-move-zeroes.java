class Solution {
    public void moveZeroes(int[] nums) {

        int i=0;
        int cnt=0;

        for(int j=0;j<nums.length;j++)
        {
             if(nums[j]!=0)
             {
                nums[i]=nums[j];
                i++;
             }

             else
             cnt++;

        }

        while(cnt>0 && i<nums.length)
        {
            nums[i++]=0;
        }

        
        
    }
}