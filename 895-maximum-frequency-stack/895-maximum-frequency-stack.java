class FreqStack {
    
    class Node{
        int val;
        int freq;
        int tick;
        
        Node(int val,int freq,int tick){
            this.val=val;
            this.freq=freq;
            this.tick=tick;
        }
        
    }
    
    int tick=0;
    Map<Integer,Integer> map;
    PriorityQueue<Node> pq;

    public FreqStack() {
        
        map=new HashMap();
        pq=new PriorityQueue<>((a,b)->(Integer.compare(b.freq,a.freq)!=0 ? Integer.compare(b.freq,a.freq) :
                              Integer.compare(b.tick,a.tick)));
        
        
    }
    
    public void push(int val) {
        
        map.put(val,map.getOrDefault(val,0)+1);
        Node node=new Node(val,map.get(val),tick++);
        pq.add(node);
        
        
    }
    
    public int pop() {
         map.put(pq.peek().val, map.get(pq.peek().val) - 1);
        return pq.remove().val;
        
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */