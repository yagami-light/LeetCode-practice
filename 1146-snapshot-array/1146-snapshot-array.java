class SnapshotArray {
    List<TreeMap<Integer,Integer>> list;
    int currIndex=0;

    public SnapshotArray(int length) {
        
        list=new ArrayList();
        for(int i=0;i<length;i++){
            list.add(i,new TreeMap());
            list.get(i).put(0,0);
            
        }
        
        
    }
    
    public void set(int index, int val) {
        
        list.get(index).put(currIndex,val);
        
    }
    
    public int snap() {
        
        return currIndex++;
        
    }
    
    public int get(int index, int snap_id) {
        
        return list.get(index).floorEntry(snap_id).getValue();
        
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */