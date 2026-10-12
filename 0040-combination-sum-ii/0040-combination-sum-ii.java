class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solve(0,candidates,target,temp,res);

        return res;
        
    }

    public void solve(int i,int[] nums,int target,List<Integer> temp, List<List<Integer>> res)
    {

        if(target<0)return;

        if(target == 0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int idx=i;idx<nums.length;idx++)
        {
            if(idx>i && nums[idx-1]==nums[idx])continue;

            temp.add(nums[idx]);
            solve(idx+1,nums,target-nums[idx],temp,res);
            temp.remove(temp.size()-1);
        }

    }
}