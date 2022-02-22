class MyHashSet {

    List<Integer>[] container=null;
    int cap=1000000;
    int count=0;
    double loadfactor=0.75;
    public MyHashSet() {
        container=new LinkedList[cap];
        
    }
    
    public void add(int key) {
        if(contains(key))
            return;
        
        if(count == loadfactor*cap){
            count=0;
            cap *=2;
            List<Integer>[] oldc=container;
            container=new LinkedList[cap];
            for(int i=0;i<oldc.length;i++){
                List<Integer> list=oldc[i];
                if(list!=null){
                    for(int entry: list){
                        this.add(entry);
                    }
                }
            }
        }
        
        
        int hash=key%cap;
        if(container[hash]==null){
            container[hash]=new LinkedList();
        }
        container[hash].add(key);
        count++;
        
    }
    
    public void remove(int key) {
        int hash=key%cap;
        List<Integer> list=container[hash];
        if(list!=null){
            Iterator<Integer> iter=list.iterator();
            while(iter.hasNext()){
                if(iter.next()==key){
                    iter.remove();
                    count--;
                    break;
                    
                }
                
            }
        }
       
        
        
    }
    
    public boolean contains(int key) {
        
        int hash=key % cap;
        List<Integer> list=container[hash];
        if(list!=null){
            Iterator<Integer> iter=list.iterator();
            while(iter.hasNext()){
                if(iter.next()==key) return true;
            }
        }
        return false;
    }
    
    
    
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */