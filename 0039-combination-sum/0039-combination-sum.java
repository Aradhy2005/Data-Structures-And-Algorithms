class Solution {
    Set<List<Integer>> st=new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        solve(candidates,0,target,ans,temp);
        return ans;  
    }

    public void solve(int[] nums,int i,int target,List<List<Integer>> ans,List<Integer>temp)
    {
        if(i==nums.length || target<0)return;

        if(target==0)
        {
            if(!st.contains(temp)){
            ans.add(new ArrayList<>(temp));
            st.add(temp);
            return;
            }
        }

        temp.add(nums[i]);

        solve(nums,i+1,target-nums[i],ans,temp);
        solve(nums,i,target-nums[i],ans,temp);

        temp.remove(temp.size()-1);

        solve(nums,i+1,target,ans,temp);
    }
}