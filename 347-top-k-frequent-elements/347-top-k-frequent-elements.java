class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap();
        for(int n:nums){
            map.merge(n,1,Integer::sum);
        }
        System.out.println("map is :"+map);
        PriorityQueue<Integer> pq=new PriorityQueue((b,a)->Integer.compare(map.get(a),map.get(b)));
        pq.addAll(map.keySet());
        int[] res=new int[k];
        int i=0;
        while(i<k){
            res[i++]=pq.remove();
        }
        
        
        return res;
        
        
        
    }
}