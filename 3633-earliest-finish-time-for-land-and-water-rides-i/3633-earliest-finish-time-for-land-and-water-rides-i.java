class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int ans = Integer.MAX_VALUE;

        // Land -> Water
        for (int i = 0; i < landStartTime.length; i++) {

            int landFinish = landStartTime[i] + landDuration[i];

            for (int j = 0; j < waterStartTime.length; j++) {

                int startWater = Math.max(landFinish, waterStartTime[j]);
                int finishTime = startWater + waterDuration[j];

                ans = Math.min(ans, finishTime);
            }
        }

        // Water -> Land
        for (int i = 0; i < waterStartTime.length; i++) {

            int waterFinish = waterStartTime[i] + waterDuration[i];

            for (int j = 0; j < landStartTime.length; j++) {

                int startLand = Math.max(waterFinish, landStartTime[j]);
                int finishTime = startLand + landDuration[j];

                ans = Math.min(ans, finishTime);
            }
        }

        return ans;
    }
}