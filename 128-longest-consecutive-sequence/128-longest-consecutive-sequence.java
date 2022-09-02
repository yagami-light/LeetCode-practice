class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,List<Integer>> map=new HashMap();
        
        for(int i:nums){
            map.put(i,new ArrayList());
        }
        for(int i:nums){
            
            if(map.containsKey(i-1)){
                map.get(i-1).add(i);
                map.get(i).add(i-1);
            }
        }
        
        // System.out.println("graph iss :"+map);
        int max=0;
        Set<Integer> set=new HashSet();
        for(int i:nums){
            
            Queue<Integer> queue=new LinkedList();
            queue.add(i);
            int count=0;
            while(!queue.isEmpty()){
                
                int popped=queue.remove();
                if(set.contains(popped)) continue;
                set.add(popped);
                count++;
                for(int j:map.get(popped)){
                    if(!set.contains(j))
                    queue.add(j);
                    
                }
                
                
            }
            max=Math.max(max,count);            
            
        }
        
        return max;
        
        
    }
}