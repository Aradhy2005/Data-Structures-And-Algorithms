class Solution {
    public int uniqueXorTriplets(int[] nums) {

        Set<Integer> pair_xorr = new HashSet<>();
        Set<Integer> finalS = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                pair_xorr.add(nums[i]^nums[j]);
            }
        }

        for(int it:pair_xorr)
        {
            for(int num:nums)
            {
                finalS.add(it^num);
            }
        }
        return finalS.size();
    }
}