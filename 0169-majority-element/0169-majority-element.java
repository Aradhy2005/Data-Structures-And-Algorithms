class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> mpp = new HashMap<>();
        int leastCount = nums.length /2;
        for(int i=0 ; i< nums.length ; i++)
        {
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);

            if(mpp.get(nums[i])>leastCount)
            {
                return nums[i];
            }

        }


        return -1;
        
    }
}