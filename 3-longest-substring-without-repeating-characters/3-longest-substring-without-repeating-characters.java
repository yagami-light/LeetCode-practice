class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        Map<Character,Integer> map=new HashMap();
        Set<Character> set=new HashSet();
        int n=s.length();
        int start=0,end=0;
        int max=0;
        
        for(int i=0,j=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                
                j=Math.max(j,map.get(s.charAt(i))+1);
                
            }
            
            map.put(s.charAt(i),i);
            max=Math.max(max,i-j+1);
        }
    
                        
       return max;
}
    
}