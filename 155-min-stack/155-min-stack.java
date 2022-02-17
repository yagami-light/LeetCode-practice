class MinStack {

    Stack<Integer> st;
    Deque<Integer> deq;    
    public MinStack() {
        st=new Stack<>();
        deq=new LinkedList();
        
        
    }
    
    public void push(int val) {
        
        st.push(val);
        if(deq.isEmpty())
            deq.addFirst(val);
        else if(!deq.isEmpty()&& deq.peek()>=val)
            deq.addFirst(val);
        
    }
    
    public void pop() {
       int poppedValue= st.pop();
       if(deq.peekFirst()==poppedValue)
           deq.pop();
        
    }
    
    public int top() {
        
        return   st.peek();
    }
    
    public int getMin() {
        
        return deq.peekFirst();
        
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