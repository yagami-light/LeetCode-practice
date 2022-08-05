class Solution {
    public int minSetSize(int[] arr) {
        int size=arr.length;
        Map<Integer,Integer> map=new HashMap();
        for(int i:arr){
            map.merge(i,1,Integer::sum);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        pq.addAll(map.values());
        System.out.println("pq is :"+pq);
        int count=0;
        int removed=0;
        while(!pq.isEmpty() && removed<size/2){
            int num=pq.remove();
            removed+=num;
            count++;
            
            
        }
        
        return count;
        
        
        
        
    }
}