class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(candidates,0,target,ans,temp);
        return ans;
    }

    public void solve(int[] nums, int i, int target, List<List<Integer>> ans,List<Integer> temp)
    {
        if(target<0)return;
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int idx=i;idx<nums.length;idx++)
        {
            if(idx>i && nums[idx-1]==nums[idx])continue;

            temp.add(nums[idx]);
            solve(nums,idx+1,target-nums[idx],ans,temp);
            temp.remove(temp.size()-1);
        }

    
    }
}