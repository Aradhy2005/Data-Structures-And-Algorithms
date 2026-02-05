class Solution {
    public int subarraySum(int[] nums, int k) {

        int cnt=0;
        int prefSum=0;
        int n=nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);

        for(int num:nums)
        {
            prefSum+=num;

            int rem=prefSum-k;

            if(mpp.containsKey(rem))
            {
                cnt+=mpp.get(rem);
            }

            mpp.put(prefSum,mpp.getOrDefault(prefSum,0)+1);
        }

        return cnt;

        
    }
}