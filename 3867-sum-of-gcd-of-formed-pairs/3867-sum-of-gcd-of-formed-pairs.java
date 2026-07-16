class Solution {
    public long gcdSum(int[] nums) {

        int[] prefixGcd = new int[nums.length];

        int maxi=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=maxi)maxi=nums[i];

            prefixGcd[i]=gcd(nums[i],maxi);
        }

        Arrays.sort(prefixGcd);

        long sum=0;

        int i=0;
        int j=nums.length-1;

        while(i<j)
        {
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }

        return sum;
    }

    public int gcd(int a,int b)
    {
        if(b==0)return a;

        return gcd(b,a%b);
    }
}