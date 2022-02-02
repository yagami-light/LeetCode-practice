class AllOne {
    Map<String,Integer> map;
    PriorityQueue<String> max;
    
    PriorityQueue<String> min;


    public AllOne() {
        
        min=new PriorityQueue<>((a,b)->(Integer.compare(map.get(a),map.get(b))));
        max=new PriorityQueue<>((a,b)->(Integer.compare(map.get(b),map.get(a))));
        map=new HashMap();
        
    }
    
    public void inc(String key) {
        map.put(key,map.getOrDefault(key,0)+1);
        max.remove(key);
        min.remove(key);

        max.add(key);
        min.add(key);
            
            
    }
    
    public void dec(String key) {
        max.remove(key);
        min.remove(key);

       if( map.get(key) >1){  
           map.put(key,map.get(key)-1); 
        max.add(key);
        min.add(key);
                            
                           }else map.remove(key);
       
      
        
    }
    
    public String getMaxKey() {
        // System.out.println(max);
        // System.out.println(min);

        return !max.isEmpty() ? max.peek() : "";
    }
    
    public String getMinKey() {
        // System.out.println(max);
        // System.out.println(min);
        return !min.isEmpty() ? min.peek() : "";

    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */