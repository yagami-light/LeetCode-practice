class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map=new HashMap();
        for(String s: words){
            map.put(s,map.getOrDefault(s,0)+1);
            
        }
        
        PriorityQueue<String> pq=new PriorityQueue<>(k,(a,b)->(
            Integer.compare(map.get(b),map.get(a)) == 0 ? a.compareTo(b) : (
            Integer.compare(map.get(b),map.get(a)) )));
        pq.addAll(map.keySet());
        
        List<String> list=new ArrayList();
        for(int i=0;i<k;i++){
            list.add(pq.remove());
        }
        
        
        return list;
        
    }
}