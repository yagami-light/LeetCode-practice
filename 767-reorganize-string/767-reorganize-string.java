class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> map=new HashMap();
        
        for(char c: s.toCharArray()){
            
            int count=map.getOrDefault(c,0)+1;
            
            if(count> (s.length()+1)/2)
                return "";
            
            map.put(c,count);
            
        }
        
        
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
        pq.addAll(map.keySet());
        System.out.println("pq "+pq);
        StringBuilder str=new StringBuilder();
        while(!pq.isEmpty()){
            
            char first=pq.remove();
            if(str.isEmpty() || first != str.charAt(str.length()-1)){
              str.append(first);
                map.put(first,map.get(first)-1);
                if(map.get(first)>0)
                    pq.add(first);
            }else{
                
            char second=pq.remove();
            str.append(second);
            map.put(second,map.get(second)-1);
            if(map.get(second)>0)
                pq.add(second);
                pq.add(first);
                
                
            }
            
            
            
        }
        
        return str.toString();
        
        
    }
}