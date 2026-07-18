class Solution {
    public int findGCD(int[] nums) {

        int small=nums[0];
        int greater=nums[0];

        for(int num:nums)
        {
            if(num<small)small=num;

            if(num>greater)greater=num;
        }

        return gcd(small,greater);
        
        
    }

    public int gcd(int a,int b)
    {
        if(b==0)return a;

        return gcd(b,a%b);
    }
}