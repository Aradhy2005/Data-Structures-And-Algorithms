class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int p=0;
        int ne=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg[ne++]=nums[i];
            }

            else pos[p++]=nums[i];

        }
        int t1=0;
        int t2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)nums[i]=pos[t1++];

            else nums[i]=neg[t2++];
        }

        return nums;
        
    }
}