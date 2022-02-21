class MyHashSet {

    HashMap<Integer,Object> map;
    private  final Object CONST=new Object();
    
    public MyHashSet() {
        map=new HashMap();
    }
    
    public void add(int key) {
       // if(!map.containsKey(key))
        map.put(key,CONST);
        
        
        
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        
       return  map.containsKey(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */