class Solution {
    public String minWindow(String s, String t) {
        
        int count=t.length();
        int[] map=new int[256];
        for(char c:t.toCharArray())
            map[c]++;
        int end=0;
        int start=0;
        int n=s.length();
        int minLen=Integer.MAX_VALUE;
        int startI=0;
        while(end<n){
            
            int ch=s.charAt(end);
            if(map[ch]>0)
                count--;
            map[ch]--;
            end++;
            while(count==0){
                
                if(minLen> (end-start)){
                    startI=start;
                    minLen=end-start;
                }
                
                int ch2=s.charAt(start);
                map[ch2]++;
                if(map[ch2]>0) count++;
                start++;
                
                
                
            }
            
            
            
            
            
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(startI,startI+minLen);
        
    }
}