class Solution {
    public int search(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target)return mid;

            if(nums[left]<=nums[mid])  //LEFT HALF SORTED
            {
                if(nums[left]<=target && target<nums[mid]) // Element in left
                {
                    right=mid-1;
                }
                else
                left=mid+1;
            }

            else //RIGHT HALF IS SORTED
            {
                if(nums[right]>=target && nums[mid]<target) //Element in right
                {
                    left=mid+1;
                }

                else
                right=mid-1;
            }
        }

        return -1;
        
    }
}