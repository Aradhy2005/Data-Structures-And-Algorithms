class Solution {

    private int n;
    private int minSum = Integer.MAX_VALUE;
    private List<Integer> result = new ArrayList<>();

    public int[] findPermutation(int[] nums) {

        n = nums.length;

        boolean[] visited = new boolean[n];
        List<Integer> curr = new ArrayList<>();

        // Fix 0 as the first element
        curr.add(0);
        visited[0] = true;

        backtrack(nums, visited, curr, 0);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    private void backtrack(int[] nums,
            boolean[] visited,
            List<Integer> curr,
            int cost) {

        if (cost >= minSum) {
            return;
        }

        if (curr.size() == n) {

            int finalCost = cost + Math.abs(
                    curr.get(n - 1) - nums[curr.get(0)]);

            if (finalCost < minSum) {
                minSum = finalCost;
                result = new ArrayList<>(curr);
            }

            return;
        }

        for (int i = 1; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            visited[i] = true;
            curr.add(i);

            int prev = curr.get(curr.size() - 2);

            int newCost = cost + Math.abs(prev - nums[i]);

            backtrack(nums, visited, curr, newCost);
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}