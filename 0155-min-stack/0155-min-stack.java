class MinStack {

    Stack<Integer> st;
    Stack<Integer> min_stack;

    public MinStack() {

        st = new Stack<>();
        min_stack = new Stack<>();
    }
    
    public void push(int value) {

        st.push(value);

        if(min_stack.isEmpty() || min_stack.peek()>=value)min_stack.push(value);
        
    }
    
    public void pop() {

        int el = st.pop();

        if(min_stack.peek()==el)min_stack.pop();
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        return min_stack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */