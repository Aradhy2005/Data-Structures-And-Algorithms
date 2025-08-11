class Solution {
    public int maxProduct(int[] nums) {

        double maxi=nums[0];
        double prefix =1;
        double suffix =1; 
        
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;

            prefix*=nums[i];
            suffix*=nums[nums.length-1-i];

            maxi = Math.max(maxi,Math.max(prefix,suffix));
        }

        

        return (int)maxi;
    }
}