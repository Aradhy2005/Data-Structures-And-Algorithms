class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        ArrayList<Integer> res = new ArrayList<>();
        String s="123456789";
        String s1=String.valueOf(low);
        String s2=String.valueOf(high);

        for(int i=s1.length();i<=s2.length();i++)
        {
            for(int j=0;j<=9-i;j++)
            {
                int num=Integer.parseInt(s.substring(j,j+i));
                if(num>=low && num<=high)
                res.add(num);
            }

        }

        return res;


        
    }
}