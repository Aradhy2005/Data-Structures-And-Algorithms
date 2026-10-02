class Solution {

    int result;

    public int beautifulSubsets(int[] nums, int k) {

        result = 0;

        Map<Integer, Integer> mpp = new HashMap<>();

        solve(0, nums, k, mpp);

        return result - 1;
    }

    public void solve(int idx, int[] nums, int k,
                      Map<Integer, Integer> mpp) {

        if (idx >= nums.length) {
            result++;
            return;
        }

        // Don't take
        solve(idx + 1, nums, k, mpp);

        // Take
        if (!mpp.containsKey(nums[idx] + k) &&
            !mpp.containsKey(nums[idx] - k)) {

            mpp.put(nums[idx],
                    mpp.getOrDefault(nums[idx], 0) + 1);

            solve(idx + 1, nums, k, mpp);

            // Backtrack
            int count = mpp.get(nums[idx]) - 1;

            if (count == 0)
                mpp.remove(nums[idx]);
            else
                mpp.put(nums[idx], count);
        }
    }
}