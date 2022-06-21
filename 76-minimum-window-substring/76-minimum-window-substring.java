class Solution {
    public String minWindow(String s, String t) {
        int[] map=new int[256];
        int count=t.length();
        for(char c:t.toCharArray())
            map[c]++;
        
        int end=0,start=0;
        int n=s.length();
        int minLen=Integer.MAX_VALUE;
        int minStart=0;
        while(end<n){
            
            char c1=s.charAt(end);
            if(map[c1]>0) count--;
            map[c1]--;
            end++;
            while(count==0){
                
                if(minLen>(end-start)){
                    minStart=start;
                    minLen=end-start;
                }
                
                char c2=s.charAt(start);
                map[c2]++;
                if(map[c2]>0) count++;
                start++;
                
                
            }
            
            
            
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
        
    }
}