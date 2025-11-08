class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int [] ans= new int[temperatures.length];

        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<temperatures.length;i++)
        {

            while(!st.isEmpty())
            {
                int top=st.peek();

                if(temperatures[i]>temperatures[top])
                {
                    ans[top]=i-top;
                    st.pop();
                }

                else break;

            }

            st.push(i);
        }

        return ans;
        
    }
}