class Solution {
    public List<List<Integer>> subsets(int[] nums) {


        List<List<Integer>> res = new ArrayList<>();

        generateSub(nums,0,new ArrayList<>(),res);

        return res;
        
    }

    void generateSub(int[] nums,int i,List<Integer>Current,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(Current));
            return;
        }
        Current.add(nums[i]);
        generateSub(nums,i+1,Current,res);

        Current.remove(Current.size()-1);
        generateSub(nums,i+1,Current,res);
    }
}