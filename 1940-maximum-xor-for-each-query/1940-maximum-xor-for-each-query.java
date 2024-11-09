class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
    int n = nums.length;
        int[] result = new int[n];
        
        int mask = (1 << maximumBit) - 1;
        int cumulativeXor = 0;
        
       
        for (int num : nums) {
            cumulativeXor ^= num;
        }
        
    
        for (int i = 0; i < n; i++) {
            result[i] = cumulativeXor ^ mask;
            cumulativeXor ^= nums[n - 1 - i]; 
        }
        
        return result;
    
    }
}