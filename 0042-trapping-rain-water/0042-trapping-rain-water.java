class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;

        int ans=0;
        int l=0;
        int r=height.length-1;

        while(l<r){
            if(height[l]<=height[r])
            {
                if(lmax>height[l])
                ans+=lmax-height[l];

                else
                lmax=height[l];

                l++;
            }

            else if(height[l]>height[r])
            {
                if(rmax>height[r])
                ans+=rmax-height[r];

                else
                rmax=height[r];

                r--;
            }
        }

        return ans;
    }
}