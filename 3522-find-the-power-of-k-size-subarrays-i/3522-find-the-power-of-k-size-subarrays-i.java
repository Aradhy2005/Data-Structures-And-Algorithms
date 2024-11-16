class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] rez = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            boolean p = true;
            int m = nums[i];
            
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    p = false;
                    break;
                }
                m = Math.max(m, nums[j + 1]);
            }
            
            if (p) {
                rez[i] = m;
            } else {
                rez[i] = -1;
            }
        }
        
        return rez;
    }
}