class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer,Integer> mpp = new HashMap<>();
        int sum=0;
        mpp.put(0,1);
        int result=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0)
            {
                rem+=k;
            }

            if(mpp.containsKey(rem))
            {
                result+=mpp.get(rem);
            }

            mpp.put(rem,mpp.getOrDefault(rem, 0)+1);
        }

        return result;
        
    }
}