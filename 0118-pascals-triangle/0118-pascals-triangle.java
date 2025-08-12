class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

       for(int i=1;i<=numRows;i++)
       {
        res.add(genrow(i));
       }
        
        return res;
    }
    public List<Integer> genrow(int n) {

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        long ans=1;

        for(int i=1;i<n;i++)
        {
            ans=ans*(n-i);
            ans=ans/i;
            temp.add((int)ans);
        }

        return temp;
    }
}