class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        int n = (1<<nums.length);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int mask= 0 ; mask<n ;mask++)
        {
                List<Integer> subset = new ArrayList<>();
        for(int i=0 ; i<nums.length ;i++)
        {
            if((mask & (1<<i)) != 0)
            subset.add(nums[i]);
            
        }
        ans.add(subset);
        }

        return ans;
        
        
    }
}