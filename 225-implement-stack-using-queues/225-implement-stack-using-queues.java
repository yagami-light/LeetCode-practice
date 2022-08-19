class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    
    public MyStack() {
        queue1=new LinkedList();
        queue2=new LinkedList();
    }
    
    public void push(int x) {
        queue1.add(x);
        // System.out.println("push queue1 :"+queue1);
        
    }
    
    public int pop() {
        int res=-1;
        while(!queue1.isEmpty()){
            int no=queue1.remove();
            if(!queue1.isEmpty())
            queue2.add(no);
            else
                res=no;
            
        }
        
      
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
     
        return res;
        
        
        
        
    }
    
    public int top() {
        int res=-1;
        while(!queue1.isEmpty()){
            int no=queue1.remove();
            // System.out.println("no is :"+no);
            queue2.add(no);
            if(queue1.isEmpty()){
                res=no;
            }
        }
      
           // System.out.println("res is top :"+res);
       
        Queue<Integer> temp=queue1;
        queue1=queue2;
        queue2=temp;
              // System.out.println("queue1 :"+queue1);

        return res;
        
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */