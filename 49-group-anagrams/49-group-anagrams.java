class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap();
        
        for(String str:strs){
            int[] num=new int[26];
            for(char c:str.toCharArray()){
                num[c-'a']++;
            }
            String key="";
            for(int n:num){
               key+=n+"#";
            }
            if(map.containsKey(key))
                map.get(key).add(str);
            else{
                map.put(key,new ArrayList());
                   map.get(key).add(str);
                
                
            }
            
            
            
        }
        
        return new ArrayList(map.values());
        
        
    }
}