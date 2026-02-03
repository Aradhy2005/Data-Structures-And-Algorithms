class Solution {
    public int majorityElement(int[] nums) {

        int i=0;
        int el=nums[0];
        int cnt=0;

        while(i<nums.length)
        {
            if(cnt==0)
            {
                el=nums[i];
                cnt=1;
            }

            else if(el==nums[i])
            {
                cnt++;
            }

            else
            {
                cnt--;
            }

            i++;
        }


        return el;

        
    }
}