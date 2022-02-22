class MyHashSet {

    List<Integer>[] container;
    int cap=10000;
    double load=0.75;
    
    int count=0;
    public MyHashSet() {
        
        container=new LinkedList[cap];
        
    }
    
    public void add(int key) {
        int hash=key % cap;
        if(this.contains(key))
            return;
        
        if(load*count == cap){
            
            List<Integer>[] oldc=container;
            cap *= 2;
            container=new LinkedList[cap];
            
            for(int i=0;i<oldc.length;i++){
                
                List<Integer> list=oldc[i];
                if(list!=null){
                    for(int n:list){
                        this.add(n);
                    }
                }
            }
            
            
            
        }
        
        
        List<Integer> list=container[hash];
        if(list==null){
        container[hash]=new LinkedList();
        }
            container[hash].add(key);
            count++;
        
        
    }
    
    public void remove(int key) {
        int hash = key % cap;
        if(!this.contains(key))
            return;
        
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
                if(iter.next() == key)
                    return true;
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