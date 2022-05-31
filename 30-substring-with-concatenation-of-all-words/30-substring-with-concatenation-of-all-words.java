class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result=new ArrayList();
        if(s==null || s.length()==0 || words==null || words.length==0 )
            return result;
        
        Map<String,Integer> freqMap=new HashMap();
        for(String word:words)
            freqMap.put(word,freqMap.getOrDefault(word,0)+1);
        
        int wordLength=words[0].length();
        int noOfWords=words.length;
        
        for(int i=0;i<= (s.length()- (wordLength*noOfWords));i++){
            
            Map<String,Integer> seenMap=new HashMap();
            
            for(int j=0;j<noOfWords;j++){
                
                int wordIndex=i+(j*wordLength);
                String word=s.substring(wordIndex,wordIndex+wordLength);
                
                if(!freqMap.containsKey(word))
                    break;
                
                seenMap.put(word,seenMap.getOrDefault(word,0)+1);
                
                if(seenMap.get(word) > freqMap.getOrDefault(word,0))
                    break;
                
                 if(j+1 == noOfWords)
                result.add(i);
                
                
                
            }
            
           
            
            
            
            
            
        }
        
        return result;
        
        
    }
}