class Solution {
    public String frequencySort(String s) {
        
        // char[] strArray=s.toCharArray();
     
        Map<Character,Integer> map=new HashMap();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
           PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(Integer.compare(map.get(b),map.get(a))));
        pq.addAll(map.keySet());
        
        StringBuilder strB=new StringBuilder();
        while(!pq.isEmpty()){
            Character c=pq.remove();
            int n=map.get(c);
            
            for(int i=0;i<n;i++){
                strB.append(c);
            }
            
            
            
        }
        
        
        return strB.toString();
        
    }
}