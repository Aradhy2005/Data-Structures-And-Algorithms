class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])continue;

            for(int j=i+1;j<nums.length;j++)
            {
                if(j!=(i+1) && nums[j]==nums[j-1])continue;

                int k=j+1;
                int l=nums.length-1;

                while(k<l){

                long sum=nums[i];
                sum+=nums[j];
                sum+=nums[k];
                sum+=nums[l];

                if(sum==target)
                {
                   List<Integer> arr = new ArrayList<>();
                   arr.add(nums[i]);
                   arr.add(nums[j]);
                   arr.add(nums[k]);
                   arr.add(nums[l]);

                   res.add(arr);
                   k++;
                   l--;
                   while(k<l && nums[k-1]==nums[k])k++;

                   while(k<l && nums[l]==nums[l+1])l--;
                }
                else if(sum<target)k++;
                else l--;

                }
            }
        }

        return res;
        
    }
}