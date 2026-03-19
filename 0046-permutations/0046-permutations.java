class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans=new ArrayList<>();
        getParams(nums,0,ans);

        return ans;
        
    }

    void getParams(int[] nums, int idx, List<List<Integer>> ans) {

        if(idx==nums.length) {

            List<Integer> temp=new ArrayList<>();
            for(int num:nums)temp.add(num);

            ans.add(new ArrayList<>(temp));
            return;

        }
        


        for(int i=idx;i<nums.length;i++)
        {
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;

            getParams(nums,idx+1,ans);

            temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;
        }

    }
}