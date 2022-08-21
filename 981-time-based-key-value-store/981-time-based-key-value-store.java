class TimeMap {

    Map<String,String> map;
    
    public TimeMap() {
        map=new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        String newKey=key+"@"+timestamp;
        map.put(newKey,value);
    }
    
    public String get(String key, int timestamp) {
        String newKey=key+"@"+timestamp;
        
        if(map.containsKey(newKey)) return map.get(newKey);
        for(int i=timestamp;i>=0;i--){
            String newKey1=key+"@"+i;
            if(map.containsKey(newKey1)) return map.get(newKey1);
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */