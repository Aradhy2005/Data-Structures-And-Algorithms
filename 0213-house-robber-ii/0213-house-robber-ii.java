class Solution {
    public int rob(int[] nums) {

        if (nums.length == 1) return nums[0];

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i=0;i<nums.length-1;i++)temp1.add(nums[i]);
        for(int i=1;i<nums.length;i++)temp2.add(nums[i]);

        int ans1 = helper(temp1);
        int ans2 = helper(temp2);

        return Math.max(ans1,ans2);

        
    }

    public int helper(List<Integer>temp)
    {
        int[] dp = new int[temp.size()];;
        dp[0]=temp.get(0);


        for(int i=1;i<temp.size();i++)
        {
            int pick = temp.get(i);

            if(i>1)
            pick+=dp[i-2];;

            int nonPick = dp[i-1];

            dp[i]=Math.max(pick,nonPick);
        }

        return dp[temp.size()-1];
    }
}