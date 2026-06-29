class Solution {
    public int missingNumber(int[] nums) {

        int arraySum=0;
        for(int a:nums)arraySum+=a;

        int totalSum=0;
        for(int i=0;i<=nums.length;i++)
        {
            totalSum+=i;
        }

        return totalSum-arraySum;
        
    }
}