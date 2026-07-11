class Solution {
    public int findPeakElement(int[] nums) {

        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(mid>0 && mid<nums.length && nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])return mid;

            if(nums[mid]>nums[left])left=mid+1;

            else right=mid-1;
        }

        return 0;
        
    }
}