class LRUCache {
    private Map<Integer,DlinkNode> cache;
    private DlinkNode head,tail;
    private int capacity;
    private int count;
    class DlinkNode{
        int key;
        int value;
        DlinkNode prev;
        DlinkNode next;
    }
    
    private void removeNode(DlinkNode node){
        DlinkNode prevNode=node.prev;
        DlinkNode nextNode=node.next;
        
        
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        
    }
    private void addNextToHead(DlinkNode node){
        
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
        
        
    }
    
    private DlinkNode removeTailNode(){
        DlinkNode prev=tail.prev;
        this.removeNode(prev);
        
        return prev;
    }
    

    
    private void moveToHead(DlinkNode node){
        this.removeNode(node);
        this.addNextToHead(node);
    }
    
    public LRUCache(int capacity) {
        cache=new HashMap();
        this.capacity=capacity;
        count=0;
        head=new DlinkNode();
        tail=new DlinkNode();
        head.next=tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
        
    }
    
    public int get(int key) {
        System.out.println("get key :"+key);
        DlinkNode node=cache.get(key);
        if(node!=null){
            
            this.moveToHead(node);
            return node.value;
        }
        else{
            return -1;
        }
        
        
        
    }
    
    public void put(int key, int value) {
        System.out.println("put key :"+key);
        DlinkNode node=cache.get(key);
        if(node==null){
            DlinkNode addNode=new DlinkNode();
            addNode.key=key;
            addNode.value=value;
            cache.put(key,addNode);
            this.addNextToHead(addNode);
            count++;
            if(count>capacity){
                DlinkNode tailNode=this.removeTailNode();
                cache.remove(tailNode.key);
                count--;
                
            }
            
            
        }else{
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