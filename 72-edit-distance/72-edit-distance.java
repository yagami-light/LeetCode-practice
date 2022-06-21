class Solution {
    Map<String,Integer> map=new HashMap();
    public int minDistance(String word1, String word2) {
        
        
        return minDistanceUtil(word1,word2);
        
    }
    
    public int minDistanceUtil(String word1,String word2){
    
        if(word1.length()==0 && word2.length()==0)
            return 0;
        if(word1.length()==0 )
            return word2.length();
        if(word2.length()==0)
            return word1.length();
        String key=word1+"@"+word2;
        if(map.containsKey(key))
            return map.get(key);
        int minOps= 1+Math.min(minDistanceUtil(word1.substring(1),word2.substring(1)),(Math.min(minDistanceUtil(word1.substring(1),word2) , minDistanceUtil(word1,word2.substring(1)))));
        int noOps=Integer.MAX_VALUE;
        if(word1.charAt(0)==word2.charAt(0))
         noOps=minDistanceUtil(word1.substring(1),word2.substring(1));
        
        map.put(key, Math.min(minOps,noOps));
        return map.get(key);
        
        
        
        
    }
    
    
}