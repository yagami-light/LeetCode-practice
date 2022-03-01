class Solution {
    public String frequencySort(String s) {
        
        Map<Character,Integer> map=new HashMap();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->Integer.compare(map.get(b),map.get(a)));
        pq.addAll(map.keySet());
        
        StringBuilder str=new StringBuilder();
        int count=0;
        while(count<map.size()){
            Character c=pq.remove();
            str.append(((c+"").repeat(map.get(c))).toString());
            count++;
        }
        return str.toString();
        
        
        
    }
}