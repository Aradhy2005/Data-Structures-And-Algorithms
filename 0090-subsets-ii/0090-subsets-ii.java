class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        generateSub(nums,0,new ArrayList<>(),res);
        return res;
        
    }

    public void generateSub(int[] nums,int i,List<Integer>curr,List<List<Integer>> res)
    {
        if(i==nums.length)
        {
           res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);

        generateSub(nums,i+1,curr,res);

        curr.remove(curr.size()-1);
        int idx=i+1;

        while(idx<nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }

        generateSub(nums,idx,curr,res);
    }
}