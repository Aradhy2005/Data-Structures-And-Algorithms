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
        int prev = temp.get(0);
        int prev2 = 0;

        for(int i=1;i<temp.size();i++)
        {
            int pick = temp.get(i)+prev2;
            int notPick = prev;

            int curr = Math.max(pick , notPick);

            prev2=prev;
            prev=curr;
        }

        return prev;
    }
}