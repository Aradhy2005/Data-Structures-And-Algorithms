class MinStack {

    Stack<Integer> st= new Stack<>();
    Stack<Integer> min_data=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        
        st.push(val);

        if(min_data.size()==0 || val<=min_data.peek())
        min_data.push(val);
        
    }
    
    public void pop() {

            
        int val=st.pop();

        if(val==min_data.peek())
        {
            min_data.pop();
        }
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        return min_data.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */