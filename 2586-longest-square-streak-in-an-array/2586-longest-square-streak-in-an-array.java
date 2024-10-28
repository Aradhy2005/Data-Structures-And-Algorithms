class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> mpp= new HashMap<>();

        int maxStreak=1;

        for(int num: nums){
            int root=(int)Math.sqrt(num);

            if(root*root == num && mpp.containsKey(root))
            {
                mpp.put(num,mpp.get(root)+1);
            }

            else
            {
                mpp.put(num,1);
            }

            maxStreak=Math.max(maxStreak,mpp.get(num));
        }
        return maxStreak>1 ? maxStreak: -1;
    }
}