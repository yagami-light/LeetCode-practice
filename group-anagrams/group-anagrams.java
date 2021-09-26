class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap();
        
        for(String str: strs){
            
            char[] strArray=str.toCharArray();
            Arrays.sort(strArray);
            String sortedKey=new String(strArray);
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList());
            }
            map.get(sortedKey).add(str);
            
            
        }
        
        
        return map.values().stream().collect(Collectors.toList());
    }
}