class SnapshotArray {
    
    Map<Integer,Map<Integer,Integer>> map;
    Map<Integer,Integer> subMap;
    int currIndex=0;

    public SnapshotArray(int length) {
        map=new HashMap();
        map.put(currIndex,new HashMap());
    
    }
    
    public void set(int index, int val) {
        
        map.get(currIndex).put(index,val);
        
    }
    
    public int snap() {
        Map<Integer,Integer> coppy=new HashMap();
        Map<Integer,Integer> sub=map.get(currIndex);
        coppy.putAll(sub);
        currIndex++;
                map.put(currIndex,coppy);
return currIndex-1;
        
        
    }
    
    public int get(int index, int snap_id) {
        if(map.get(snap_id).containsKey(index))
        return map.get(snap_id).get(index);
        else
            return  0;
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */