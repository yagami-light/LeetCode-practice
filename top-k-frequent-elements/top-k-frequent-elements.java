import java.util.function.*;
class Solution {
    class classNode{
        Integer value;
        Long freq;
        
        classNode(Integer value,Long freq){
            this.value=value;
            this.freq=freq;
        }
        
        
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<classNode> pq=new PriorityQueue(Comparator.comparing((classNode node)->node.freq).reversed());
        int[] result=new int[k];
        Map<Integer,Long> map=Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().forEach(i->pq.add(new classNode(i.getKey(),i.getValue())));
        
        for(int i=0;i<k;i++){
            result[i]=pq.remove().value;
            
            
        }
        
        return result;
        
    }
}