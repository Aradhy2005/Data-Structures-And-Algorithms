class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int maj1=0,maj2=0,cnt1=0,cnt2=0;
      for(int i=0;i<nums.length;i++)
      {

         if(maj1==nums[i])
         cnt1++;

         else if(maj2==nums[i])
         cnt2++;

         else if(cnt1==0)
         {
            maj1=nums[i];
            cnt1=1;
         }

         else if(cnt2==0)
         {
            maj2=nums[i];
            cnt2=1;
         }

         else{
            cnt1--;
            cnt2--;
         }

      } 

      List<Integer> ans = new ArrayList<>();
      cnt1=0;
      cnt2=0;

      for(int i=0;i<nums.length;i++)
      {
           if(nums[i]==maj1)cnt1++;

           else if(nums[i]==maj2)cnt2++;


      }

      if(cnt1>(nums.length/3))ans.add(maj1);

      if(cnt2>(nums.length/3))ans.add(maj2);

      return ans;
        
    }
}