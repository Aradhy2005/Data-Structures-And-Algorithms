class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> st= new HashSet<>();

        int i=0;
        int j=i;

        int n=nums.length;

        while(j<n)
        {
            if(Math.abs(i-j)>k)
            {
                st.remove(nums[i]);
                i++;
            }

            if(st.contains(nums[j]))
            return true;

            st.add(nums[j]);
            j++;
        }


        return false;
 
    }
}