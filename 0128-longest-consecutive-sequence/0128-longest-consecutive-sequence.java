class Solution {
    public int longestConsecutive(int[] nums) {

        int longest = 1;

        if(nums.length==0)return 0;

        HashSet<Integer> clone = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            clone.add(nums[i]);
        }

        for(int it: clone)
        {
            if(!(clone.contains(it-1)))
            {
                int cnt = 1;
                int x = it;

                while(clone.contains(x+1))
                {
                      cnt++;
                      x=x+1;
                }

                longest = Math.max(longest,cnt);
            }
        }

        return longest;
        
    }
}