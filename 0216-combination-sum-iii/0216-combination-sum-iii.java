class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();

        solve(1,k,n,new ArrayList<>(),res);

        return res;
        
    }

    public void solve(int start,int k,int n,List<Integer> curr,List<List<Integer>> res)
    {
        if(curr.size()==k && n==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(curr.size()>k || n<0)return;

        for(int i=start;i<=9;i++)
        {
            curr.add(i);
            solve(i+1,k,n-i,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}