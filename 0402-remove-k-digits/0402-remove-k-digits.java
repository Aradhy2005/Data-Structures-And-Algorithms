class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st=new Stack<>();

        if(num.length()==k)return "0";

        for(int i=0;i<num.length();i++)
        {
            while(!st.isEmpty() && st.peek()>num.charAt(i) &&k!=0)
            {
                st.pop();
                k--;
            }

            st.push(num.charAt(i));
        }

        while(k>0)
        {
            st.pop();
            k--;
        }
     String res="";
     for(int i=0;i<st.size();i++)
     {
        res+=st.get(i);
     }

     int i=0; 
     while(i<res.length() && res.charAt(i)=='0')i++;

      if(i==res.length())return "0";
      return res.substring(i);
        
    }
}