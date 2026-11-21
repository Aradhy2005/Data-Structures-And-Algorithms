class Solution {
    public String reverseVowels(String s) {

        StringBuilder res = new StringBuilder();

        List<Character> temp = new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if("aeiouAEIOU".contains(ch+""))
            {
                temp.add(ch);
            }
        }

        for(int i=0;i<s.length();i++)
        {
            if("aeiouAEIOU".contains(s.charAt(i)+""))
            {
                res.append(temp.remove(temp.size() - 1));
            }
            else
            res.append(s.charAt(i));
        }

        return res.toString();
        
    }
}