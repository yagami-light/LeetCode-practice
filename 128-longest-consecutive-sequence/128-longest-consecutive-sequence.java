class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap();
        for(int val:nums)
            map.put(val,new ArrayList());
        
        for(int val:nums){
            if(map.containsKey(val-1)){
                map.get(val-1).add(val);
                map.get(val).add(val-1);
            }
            }
        
        for(int val:nums){
            if(map.containsKey(val+1)){
                map.get(val+1).add(val);
                map.get(val).add(val+1);
            }
        }
        
        Queue<Integer> queue=new LinkedList();
        Set<Integer> set=new HashSet();
        int maxLength=0;
        
        for(int i: map.keySet()){
            if(!set.contains(i)){
            set.add(i);
            queue.add(i);
                   int length=1;
            while(!queue.isEmpty()){
             
                int size=queue.size();
                // for(int j=0;j<size;j++){
                    int num=queue.remove();
                    for(int val:map.get(num)){
                        if(!set.contains(val)){
                            set.add(val);
                        queue.add(val);
                        length++;
                        
                        }
                        
                    // }
                    
                }
                maxLength=Math.max(maxLength,length);
                
                
            }
            
            
            
        }
        }
        
        
        return maxLength;
        
        
    }
}