class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            int cnt=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])cnt++;
            }

            if(cnt>(nums.length)/3 && !ans.contains(nums[i]))
            ans.add(nums[i]);
        }

        return ans;
        
    }
}