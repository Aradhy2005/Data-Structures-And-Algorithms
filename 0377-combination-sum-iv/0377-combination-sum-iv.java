class Solution {
    public int combinationSum4(int[] nums, int target) {

        Integer[] dp = new Integer[target+1];

        return solve(0, nums, target,dp);

    }

    public int solve(int idx, int[] nums, int target,Integer[] dp) {
        if (target == 0)
            return 1;
        if (idx >= nums.length || target<0)
            return 0;

        if(dp[target]!=null)return dp[target];

        int result = 0;

        for(int i=idx;i<nums.length;i++)
        {
            int take_i = solve(0,nums,target-nums[i],dp);
            result+=take_i;
        }

        return dp[target]=result;
    }

}