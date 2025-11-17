class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] nsl = NSL(heights);
        int[] nsr = NSR(heights);

        int ans = 0;

        for(int i = 0; i < heights.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(ans, currArea);
        }

        return ans;
    }

    public int[] NSR(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nsr = new int[n];

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
                st.pop();

            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nsr;
    }

    public int[] NSL(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int[] nsl = new int[n];

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
                st.pop();

            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nsl;
    }
}
