class Solution {
    public int sumSubarrayMins(int[] arr) {

        ArrayList<Integer> nsl=NSL(arr);
        ArrayList<Integer> nsr=NSR(arr);
        long sum=0;
        long m=1000000007;

        for(int i=0;i<arr.length;i++)
        {
            long left=i-nsl.get(i);
            long right=nsr.get(i)-i;

            long ways=(left*right)%m;
            sum=(sum+(arr[i]*ways)%m)%m;

        }

        return (int)sum;
        
    }

    public ArrayList<Integer> NSL(int[]arr)
    {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> nsl=new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
            st.pop();

            nsl.add((st.isEmpty())?-1:st.peek());

            st.push(i);
        }

        return nsl;


    }

    public ArrayList<Integer> NSR(int[]arr)
    {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> nsr=new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();

            nsr.add((st.isEmpty())?arr.length:st.peek());

            st.push(i);
        }

        Collections.reverse(nsr);

        return nsr;


    }
}