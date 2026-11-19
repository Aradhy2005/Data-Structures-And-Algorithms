class Solution {
    public int minimizeSum(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int firstTwo = nums[n-1]-nums[2];
        int lastTwo = nums[n-3]-nums[0];
        int oneFromEach = nums[n-2]-nums[1];
        return Math.min(oneFromEach,Math.min(firstTwo,lastTwo));
        
    }
}