class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            if (diff < minDiff) {
                // Found smaller difference → reset result
                minDiff = diff;
                res.clear();

                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                res.add(temp);

            } else if (diff == minDiff) {
                // Found another pair with same min difference
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[i + 1]);
                res.add(temp);
            }
        }

        return res;
    }
}
