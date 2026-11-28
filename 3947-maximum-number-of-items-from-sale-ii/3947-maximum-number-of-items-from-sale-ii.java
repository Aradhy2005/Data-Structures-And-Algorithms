import java.util.Arrays;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE;
        int maxFactor = 0;

        for (int[] item : items) {
            if (item[0] > maxFactor) maxFactor = item[0];
            if (item[1] < minPrice) minPrice = item[1];
        }

        int[] freq = new int[maxFactor + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }

        int[] multCount = new int[maxFactor + 1];
        for (int i = 1; i <= maxFactor; i++) {
            if (freq[i] > 0) {
                for (int j = i; j <= maxFactor; j += i) {
                    multCount[i] += freq[j];
                }
            }
        }

        long threshold = 2L * minPrice;
        long[] bundles = new long[n];
        int validCount = 0;

        for (int[] item : items) {
            int price = item[1];
            if (price < threshold) {
                int bonus = multCount[item[0]] - 1;
                if (bonus > 0) {
                    bundles[validCount++] = ((long) price << 32) | (bonus & 0xFFFFFFFFL);
                }
            }
        }

        Arrays.sort(bundles, 0, validCount);

        int totalItems = 0;
        long remBudget = budget;

        for (int i = 0; i < validCount; i++) {
            long price = bundles[i] >>> 32;
            if (remBudget < price) break;

            long available = bundles[i] & 0xFFFFFFFFL;
            long buy = Math.min(available, remBudget / price);

            remBudget -= buy * price;
            totalItems += (int) (buy * 2);
        }

        totalItems += (int) (remBudget / minPrice);

        return totalItems;
    }
}