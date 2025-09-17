class Solution {
    public int findMin(int[] nums) {
        int n=nums.length-1;
        int ans=Integer.MAX_VALUE;
        if(nums[0]<nums[n])return nums[0];

        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
             

            if(nums[low]<=nums[mid])
            {
                
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }

            else
            {
                
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }

        return ans;


        
    }
}