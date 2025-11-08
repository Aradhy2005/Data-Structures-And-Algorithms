class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [] ans=new int[nums1.length];

        int k=0;

        for(int i=0;i<nums1.length;i++)
        {
            int n=nums1[i];

            for(int j=0;j<nums2.length;j++)
            {
                int flag=0;
                if(nums1[i]==nums2[j])
                {
                    int temp=j+1;

                    while(temp<nums2.length)
                    {
                        if(nums2[temp]>nums1[i])
                        {
                            ans[k++]=nums2[temp];
                            flag=1;
                            break;

                        }

                        temp++;

                    }

                    if(flag==0)ans[k++]=-1;
                }
            }
        }

        return ans;
        
    }
}