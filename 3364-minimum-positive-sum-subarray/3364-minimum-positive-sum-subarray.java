class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int res = Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++)
        {
            int curr_Sum=0;
            for(int j=i;j<nums.size();j++)
            {
                curr_Sum+=nums.get(j);
                if(j-i+1>=l && j-i+1<=r)
                {
                    if(curr_Sum>0)
                    {
                        res = Math.min(res,curr_Sum);
                    }

                    if(j-i+1>r)break;
                }
            }
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}