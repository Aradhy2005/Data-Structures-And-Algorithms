class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int TotalSum = n*(n+1)/2;   //total sum of range
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];  //sum of array

        }

        return TotalSum-sum;
        
    }
}