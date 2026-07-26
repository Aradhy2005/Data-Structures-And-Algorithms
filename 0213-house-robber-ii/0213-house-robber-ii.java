class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i=0;i<nums.length-1;i++)temp1.add(nums[i]);
        for(int i=1;i<nums.length;i++)temp2.add(nums[i]);

        int[] dp1 = new int[temp1.size()];
        int[] dp2 = new int[temp2.size()];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

        int ans1 = helper(temp1,temp1.size()-1,dp1);
        int ans2 = helper(temp2,temp2.size()-1,dp2);

        return Math.max(ans1,ans2);

        
    }

    public int helper(List<Integer>temp , int i,int[] dp)
    {
        if(i==0)return temp.get(0);
        if(i<0)return 0;

        if(dp[i]!=-1)return dp[i];

        int pick=0;
        pick = temp.get(i)+helper(temp,i-2,dp);
        int nonPick = 0+helper(temp,i-1,dp);

        return dp[i] = Math.max(pick,nonPick);
    }
}