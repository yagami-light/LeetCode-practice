class Solution {
    public boolean isScramble(String s1, String s2) {
     
        Map<String,Boolean> cache=new HashMap();
        return isScrambleUtil(s1,s2,cache);
    }
    
    private boolean isScrambleUtil(String s1,String s2,Map<String,Boolean> cache){
        if(s1.length()==1)
            return s1.equals(s2);
        if(s1.equals(s2))
            return true;
        String key=s1+"@"+s2;
        if(cache.get(key)!=null)
            return cache.get(key);
        int n=s1.length();
        for(int i=1;i<s1.length();i++){
            
            
            if((isScrambleUtil(s1.substring(0,i),s2.substring(0,i),cache) && isScrambleUtil(s1.substring(i),s2.substring(i),cache)) || 
               (isScrambleUtil(s1.substring(0,i),s2.substring(n-i),cache) && isScrambleUtil(s1.substring(i),s2.substring(0,n-i),cache) )){
                cache.put(key,true);
                 return cache.get(key);
                
                
            }
            
            
        }
        
 cache.put(key,false);        
          return cache.get(key);
        
    }
    
    
}