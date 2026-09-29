class Solution {
    public List<String> letterCombinations(String digits) {

        HashMap<Character,String> mpp = new HashMap<>();
        mpp.put('2',"abc");
        mpp.put('3',"def");
        mpp.put('4',"ghi");
        mpp.put('5',"jkl");
        mpp.put('6',"mno");
        mpp.put('7',"pqrs");
        mpp.put('8',"tuv");
        mpp.put('9',"wxyz");

        List<String> res = new ArrayList<>();

        solve(0,new StringBuilder(),mpp,res,digits);

        return res;
        
    }

    public void solve(int idx,StringBuilder sb,HashMap<Character,String>mpp,List<String> res,String s)
    {
        if(sb.length()==s.length())
        {
            res.add(sb.toString());
            return;
        }

        for(int i=0;i<mpp.get(s.charAt(idx)).length();i++)
        {
            sb.append(mpp.get(s.charAt(idx)).charAt(i));
            solve(idx+1,sb,mpp,res,s);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}