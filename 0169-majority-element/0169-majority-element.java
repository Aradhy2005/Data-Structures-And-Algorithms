class Solution {
    public int majorityElement(int[] nums) {

        int el=nums[0];
        int cnt=0;


        for(int i=0;i<nums.length;i++)
        {
            if(cnt==0)
            {
                cnt=1;
                el=nums[i];
               
            }

            else if(el==nums[i])
            {
                cnt++;
            }

            else{
                cnt--;
            }
        }
        

        return el;
    }
}