class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st=new Stack<>();


        for(int i=0;i<asteroids.length;i++)
        {

            while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0  && (st.peek()+asteroids[i])<0)
            st.pop();

            if(!st.isEmpty() && st.peek()>0 && asteroids[i]<0 && (st.peek()+asteroids[i])>0)continue;

            if(!st.isEmpty() && st.peek()>0 && asteroids[i]<0 && (st.peek()+asteroids[i])==0)
            {
              st.pop();
              continue;
            }

            st.push(asteroids[i]);

        }

        if(st.size()==0)return new int[]{};

        int[] arr = new int[st.size()];

        for(int i=0;i<st.size();i++)
        {
           arr[i]=st.get(i);
        }

        

        return arr;
        
    }
}