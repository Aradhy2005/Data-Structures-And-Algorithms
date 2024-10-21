class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> mpp =new HashMap<>();

        int ans[]=new int[2];


        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int more=target-n;

            if(mpp.containsKey(more))
            {
                ans[0]=mpp.get(more);
                ans[1]=i;

                return ans;
            }

            mpp.put(n,i);
        }

        return ans;
        
    }
}