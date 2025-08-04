class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;

        //Finding First Drop from right to left
        int gola_index=-1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                gola_index=i-1;
                break;
            }
        }

        //swapping two elements
        if(gola_index!=-1)
        {
        int swap_index=gola_index;

        for(int j=n-1;j>=gola_index+1;j--)
        {
            if(nums[j]>nums[gola_index])
            {
                swap_index = j;
                break;
            }
        }

        int temp = nums[gola_index];
        nums[gola_index]=nums[swap_index];
        nums[swap_index]=temp;

        }

        int i=gola_index+1;
        int j=n-1;

        while(i<=j)
        {
            int tempo = nums[i];
            nums[i]=nums[j];
            nums[j]=tempo;

            i++;
            j--;
        }

        
    }
}