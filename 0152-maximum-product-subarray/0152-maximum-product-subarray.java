class Solution {
    public int maxProduct(int[] nums) {
        int max_Product= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int prod=1;
            for(int j=i;j<nums.length;j++)
            {
               prod*=nums[j];
                if(prod>max_Product)max_Product=prod;
            }
        }

        return max_Product;
        
    }
}