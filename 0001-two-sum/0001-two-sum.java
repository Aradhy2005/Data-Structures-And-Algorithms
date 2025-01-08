class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0 ; i<nums.length;i++)
        {
            int left = target - nums[i];
             if(mpp.containsKey(left))
             {
                return new int []{i,mpp.get(left)};
             }

             else
             mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}