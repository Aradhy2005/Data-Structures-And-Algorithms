class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int res=0;
        int oddcount=0;

        for(int i=0;i<nums.length;i++)
        {
            oddcount+=nums[i]%2;
            if(mpp.containsKey(oddcount-k))
            {
                res+=mpp.get(oddcount-k);
            }

           mpp.put(oddcount, mpp.getOrDefault(oddcount, 0) + 1);

        }

        return res;
        
    }
}