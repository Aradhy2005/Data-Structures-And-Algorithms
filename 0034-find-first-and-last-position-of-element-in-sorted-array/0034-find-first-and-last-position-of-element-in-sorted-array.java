class Solution {
    public int[] searchRange(int[] nums, int target) {


    int [] ans={FirstOcuur(nums,target),LastOcuur(nums,target)};
    return ans;

   
        
    }

    int FirstOcuur(int[]nums,int target)
    {
        int low=0;
        int n=nums.length-1;
        int high=n;

        int first=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
             first=mid;
             high=mid-1;

            }

            else if(nums[mid]<target)
            low=mid+1;

            else
            {
                high=mid-1;
            }
        }

        return first;
    }


     int LastOcuur(int[]nums,int target)
    {
        int low=0;
        int n=nums.length-1;
        int high=n;

        int last=-1;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
             last=mid;
             low=mid+1;

            }

            else if(nums[mid]>target)
            high=mid-1;

            else
            {
                low=mid+1;
            }
        }

        return last;
    }
}