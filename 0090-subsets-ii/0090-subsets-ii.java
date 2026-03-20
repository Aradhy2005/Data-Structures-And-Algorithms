class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> temp= new ArrayList<>();
        Arrays.sort(nums);

        solve(nums,0,temp);

        return ans;
        
    }

    public void solve(int[] nums,int i,List<Integer> temp)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        solve(nums,i+1,temp);

        temp.remove(temp.size()-1);

        int idx=i+1;

        while(idx<nums.length && nums[idx-1]==nums[idx])
        idx++;

        solve(nums,idx,temp);
    }


}