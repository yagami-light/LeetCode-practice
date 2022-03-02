class FreqStack {
    
    List<Stack<Integer>> bucket;
    Map<Integer,Integer> map;

    public FreqStack() {
        bucket=new ArrayList();
        map=new HashMap();
        
    }
    
    public void push(int val) {
        
        map.put(val,map.getOrDefault(val,0)+1);
        int freq=map.get(val);
        if(freq-1 >= bucket.size())
            // if(bucket.get(freq-1)==null)
            bucket.add(new Stack<Integer>());
        
        bucket.get(freq-1).add(val);
        
        
        
        
    }
    
    public int pop() {
        
        int freq=bucket.size();
        int val=bucket.get(freq-1).pop();
        if(bucket.get(freq-1).isEmpty())
            bucket.remove(freq-1);
        // bucket.get(freq-1).
        
        
        
        map.put(val,map.get(val)-1);
        return  val;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */