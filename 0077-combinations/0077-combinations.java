class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();

        backtrack(1,n,k,new ArrayList<>(),res);

        return res;
        
    }

    public void backtrack(int idx,int n,int k, List<Integer> curr ,List<List<Integer>> res)
    {
        if(curr.size()==k)
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(idx>n)return;
        
        curr.add(idx);
        backtrack(idx+1,n,k,curr,res);
        curr.remove(curr.size()-1);
        backtrack(idx+1,n,k,curr,res);
    }
}