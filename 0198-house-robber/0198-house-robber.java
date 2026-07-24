class Solution {
    public int rob(int[] nums) {

        int n=nums.length;
        if(n==1)return nums[0];
 
        int prev2=nums[0];
        int prev=Math.max(nums[0],nums[1]);
        

        for(int i=2;i<n;i++)
        {
            int currI=Math.max(nums[i]+prev2,prev);
            prev2=prev;
            prev=currI;
        }
        
        return prev;
    }
}