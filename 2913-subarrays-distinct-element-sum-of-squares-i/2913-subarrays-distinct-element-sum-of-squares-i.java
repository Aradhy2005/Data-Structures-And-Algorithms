class Solution {
    public int sumCounts(List<Integer> nums) {

        int res=0;

        for(int i=0;i<nums.size();i++)
        {
            int cnt=0;
            Set<Integer> st = new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                if(!st.contains(nums.get(j)))
                {
                    st.add(nums.get(j));
                    cnt++;
                }

                res+=(cnt*cnt);
            }

            
        }
        return res;
    }
}