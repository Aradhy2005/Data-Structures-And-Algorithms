class Solution {
    public int reversePairs(int[] nums) {

     return merge_sort(nums,0,nums.length-1);
        
        
    }

    public int merge_sort(int[] nums, int low , int high)
    {
        int cnt=0;

        if(low>=high)return cnt;
        int mid = (low+high)/2;



        cnt+=merge_sort(nums,low,mid);
        cnt+=merge_sort(nums,mid+1,high);
        cnt+= countpairs(nums,low,mid,high);
        merge(nums,low,mid,high);

        return cnt;

    }

     int countpairs(int nums[],int low,int mid,int high)
    {
        int cnt=0;

        int right=mid+1;

        for(int i=low;i<=mid;i++)
        {
            while(right<=high && nums[i]>(2*(long)nums[right]))right++;

            cnt=cnt+(right-(mid+1));
        }

        return cnt;
    }

    public void merge(int[] nums , int low,int mid,int high)
    {
        List<Integer> temp= new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high)
        {
            if(nums[left]<=nums[right])
            {
               temp.add(nums[left]);
               left++;
            }

            else
            {
                temp.add(nums[right]);
                right++;

            }
        }

        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        while(right<=high)
        {
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            nums[i]=temp.get(i-low);
        }
    }
}