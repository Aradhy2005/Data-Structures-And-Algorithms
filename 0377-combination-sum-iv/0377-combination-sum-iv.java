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

        int take = solve(0, nums, target - nums[idx],dp);
        int notTake = solve(idx + 1, nums, target,dp);

        return dp[target]=take + notTake;
    }

}