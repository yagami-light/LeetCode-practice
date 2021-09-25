import java.util.function.*;
class Solution {
    class Node{
        int value;
        Long freq;
        Node(int k,Long v){
            value=k;
            freq=v;
            
        }
        
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        final PriorityQueue<Node> pq=new PriorityQueue(Comparator.comparing((Node n)-> n.freq).reversed());
        Map<Integer,Long> freq= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        freq.entrySet().stream().forEach((i)-> pq.add(new Node(i.getKey(),(i.getValue()))));
        
        for(int i=0;i<k;i++){
            result[i]=pq.remove().value;
            
        }
        
        return result;
        
        
    }
    
    
    
    
    
}