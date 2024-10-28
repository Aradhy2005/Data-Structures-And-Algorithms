class Solution {
    public int majorityElement(int[] nums) {

        HashMap <Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;

        for(int i=0 ; i<nums.length;i++)
        {
            
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            int value=entry.getValue();

            if(value>(n/2))
            return entry.getKey();
        }

        return -1;
        
    }
}