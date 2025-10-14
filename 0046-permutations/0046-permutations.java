class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        getPermute(nums,0,res);

        return res;
        
    }

    void getPermute(int[] nums,int idx, List<List<Integer>> res)
    {
        if(idx==nums.length){

            List<Integer> temp = new ArrayList<>();
            for (int n : nums) temp.add(n);
            res.add(new ArrayList<>(temp));
            return;

        }

        for(int i=idx;i<nums.length;i++)
        {
            int temp=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp;

            getPermute(nums,idx+1,res);

            int temp1=nums[i];
            nums[i]=nums[idx];
            nums[idx]=temp1;
        }
    }
}