class Solution {
    public int removeDuplicates(int[] nums) {

        int cnt = 1;
        int i=0;

        for(int j=1 ;j<nums.length ;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[++i]=nums[j];
                cnt++;
            }
        }

        return cnt;
        
    }
}