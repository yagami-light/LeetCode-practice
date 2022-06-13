class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList();
        Map<String,List<String>> map=new HashMap();
        
        for(String str: strs){
            
            char[] strArray=str.toCharArray();
            Arrays.sort(strArray);
            String key=new String(strArray);
            List<String> list=map.getOrDefault(key,new ArrayList());
            list.add(str);
            map.put(key,list);
            
            
        }
        
        for(String str:map.keySet()){
            
            res.add(map.get(str));
        }
        return res;
        
        
        
    }
}