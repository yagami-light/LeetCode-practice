class LRUCache {
    
    private DlinkNode tail,head;
    private Map<Integer,DlinkNode> map;
    private int capacity;
    private int count;

    class DlinkNode{
        int value;
        int key;
        DlinkNode next;
        DlinkNode prev;
        
        
    }
    
    private void deleteNode(DlinkNode node){
        // System.out.println("delete ndoe");
        DlinkNode nextNode=node.next;
        DlinkNode prevNode=node.prev;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        
    }
    private void addToHead(DlinkNode node){
        // node.prev=head;
       /*
        head.next=node;
        node.prev=head;
        node.next=head.next;
        head=node;
        */
        // System.out.println("node is :"+node);
          node.prev = head;
  node.next = head.next;

  head.next.prev = node;
  head.next = node;
        
        
    }
    
    private DlinkNode popTail(){
        
      
        DlinkNode prevNode=tail.prev;
       this.deleteNode(prevNode);
        return prevNode;
        
        
    }
    
    
    private void  moveToHead(DlinkNode node){
        this.deleteNode(node);
        this.addToHead(node);
    }
    
    public LRUCache(int capacity) {
        map=new HashMap();
        this.capacity=capacity;
        count=0;
        head=new DlinkNode();
        head.prev=null;
        
        tail=new DlinkNode();
        tail.next=null;
        tail.prev=head;
        head.next=tail;
        
    }
    
    public int get(int key) {
        DlinkNode node=map.get(key);
        if(node==null) return -1;
        
        this.moveToHead(node);
        return node.value;
        
    }
    
    public void put(int key, int value) {
        // System.out.println("alex is alex");
          DlinkNode node=map.get(key);
        if(node==null) {
            DlinkNode addNode=new DlinkNode();
            addNode.value=value;
            addNode.key=key;
            this.map.put(key,addNode);
            this.addToHead(addNode);
            count++;
            
            if(count> capacity){
                DlinkNode tail=this.popTail();
                this.map.remove(tail.key);
                count--;
            }
            
        }
        else{
            node.value=value;
            this.moveToHead(node);
        }
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */