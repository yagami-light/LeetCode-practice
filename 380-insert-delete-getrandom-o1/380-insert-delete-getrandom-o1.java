class RandomizedSet {
    
    Map<Integer,Integer> map;
    List<Integer> list;
    Random rand;

    public RandomizedSet() {
        map=new HashMap();
        list=new ArrayList();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        boolean contain=map.containsKey(val);
        if(contain)
            return false;
        
        map.put(val,list.size());
        list.add(val);
        return true;
        
        
        
    }
    
    public boolean remove(int val) {
        boolean contain=map.containsKey(val);
        if(!contain)
            return false;
        
        int index=map.get(val);
        if(index < list.size()-1){
            int lastValue=list.get(list.size()-1);
            list.set(index,lastValue);
            map.put(lastValue,index);
            
            
        }
        
            
        map.remove(val);
        list.remove(list.size()-1);
        
        return true;
            
        
        
    }
    
    public int getRandom() {
        
        
        return list.get(rand.nextInt(list.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */