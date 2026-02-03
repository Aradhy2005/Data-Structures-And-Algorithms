class Solution {
    public int numFactoredBinaryTrees(int[] arr) {

        int MOD = 1000000007;
        int res = 0;

        Arrays.sort(arr);

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int a : arr) mpp.put(a, 1);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && mpp.containsKey(arr[i] / arr[j])) {

                    long left = mpp.get(arr[j]);
                    long right = mpp.get(arr[i] / arr[j]);

                    long updated = (mpp.get(arr[i]) + (left * right) % MOD) % MOD;

                    mpp.put(arr[i], (int) updated);
                }
            }
        }

        for (int i : mpp.values()) {
            res = (res + i) % MOD;
        }

        return res;
    }
}
