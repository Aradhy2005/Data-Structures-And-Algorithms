class Solution {
    public int subarraySum(int[] nums, int k) {

        int prefixSum=0;
        int cnt=0;

        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);

        for(int num:nums)
        {
            prefixSum+=num;
            int rem=prefixSum-k;
            if(mpp.containsKey(rem))
            {
                cnt+=mpp.get(rem);
            }

            mpp.put(prefixSum,mpp.getOrDefault(prefixSum,0)+1);
        }
        
        return cnt;
    }
}