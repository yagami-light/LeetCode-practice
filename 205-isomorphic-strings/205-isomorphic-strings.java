class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] map=new int[512];
        
        int n=s.length();
        for(int i=0;i<n;i++){
            
            if(map[s.charAt(i)] != map[t.charAt(i)+256]) return false;
            
            map[s.charAt(i)]=map[t.charAt(i)+256]=i+1;
            
            
        }
        
        return true;
        
        
    }
}