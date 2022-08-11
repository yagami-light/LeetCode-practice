class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int K=10;
        Set<String> wordSet=new HashSet();
        Set<Integer> numSet=new HashSet();
        List<String> res=new LinkedList();
        char[] map=new char[26];
        map['A'-'A']=0;
        map['C'-'A']=1;
        map['G'-'A']=2;
        map['T'-'A']=3;
        // int v=0;
        for(int i=0;i<s.length()-K+1;i++){
            int v=0;
            for(int j=i;j<i+10;j++){
                v=v<<2;
                v |= map[s.charAt(j)-'A'];
                
                
            }
            if(!numSet.add(v) ){
                wordSet.add(s.substring(i,i+10));
            }
            
            
            
        }
        
        
        return new ArrayList(wordSet);
        
        
        
    }
}