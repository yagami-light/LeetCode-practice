class RandomizedCollection {

    Map<Integer,Set<Integer>> map;
    Random rand;
    List<Integer> list;
    
    public RandomizedCollection() {
        map=new HashMap();
        rand=new Random();
        list=new ArrayList();
        
    }
    
    public boolean insert(int val) {
        boolean contain=map.containsKey(val);
        
        if(!contain){
            map.put(val,new HashSet());
        }
       
        map.get(val).add(list.size());
        list.add(val);
        
        return !contain;
    }
    
    public boolean remove(int val) {
         boolean contain=map.containsKey(val);
        
        if(!contain){
            return false;
        }
         int index=map.get(val).iterator().next();
        map.get(val).remove(index);
        if(index<list.size()-1){
            int lastValue=list.get(list.size()-1);
            list.set(index,lastValue);
            map.get(lastValue).remove(list.size()-1);
            map.get(lastValue).add(index);
        }
        
        map.get(val).remove(list.size()-1);
        if(map.get(val).isEmpty())
            map.remove(val);
        
        list.remove(list.size()-1);
        return true;
        
        
        
    }
    
    public int getRandom() {
        
        return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */