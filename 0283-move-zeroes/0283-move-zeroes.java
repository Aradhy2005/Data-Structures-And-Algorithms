class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int i=0;

        if(n>1)
        {
           for(int j=0 ;j<nums.length;j++)
           {
              if(nums[j]!=0)
              nums[i++]=nums[j];
           }

           while(i<n)
           {
            nums[i++]=0;
           }
        }
        
    }
}