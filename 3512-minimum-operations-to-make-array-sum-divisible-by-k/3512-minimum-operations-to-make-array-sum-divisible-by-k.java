class Solution {
    public int minOperations(int[] nums, int k) {

        int sum=0;
        for(int a:nums)
        sum+=a;

        if(sum%k==0)return 0;

        if(sum<k)return sum;

        else return sum%k;
        
    }
}