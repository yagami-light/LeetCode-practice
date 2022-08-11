class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int K=10;
        Set<String> set=new HashSet();
        Map<String,Integer> map=new HashMap();
        for(int i=0;i<s.length()-K+1;i++){
        String substr=s.substring(i,i+K);
        // System.out.println("substr :"+substr);
        map.put(substr,map.getOrDefault(substr,0)+1);
        if(map.get(substr)>1){
            set.add(substr);
        }
            
            
        }
        
        
        return new ArrayList(set);
    }
}