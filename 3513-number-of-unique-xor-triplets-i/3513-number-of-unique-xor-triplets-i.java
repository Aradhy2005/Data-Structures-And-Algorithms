class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;

        if(n<=2)return n;

        int max=0;

        while(Math.pow(2,max)<=n)
        {
            max++;
        }
        
        return (int)Math.pow(2,max);
    }
}