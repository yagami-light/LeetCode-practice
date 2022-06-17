class Solution {
    public int lengthOfLastWord(String s) {
 
        int inputLen=s.length();
        boolean isStarted=false;
        int count=0;
        for(int i=inputLen-1;i>=0;i--){
            
            if(s.charAt(i)==' ' && isStarted==false)
                continue;
            if(s.charAt(i)==' ' && isStarted==true){
                return count;
            }
            
            if(Character.isAlphabetic(s.charAt(i))){
                count++;
                isStarted=true;
            }
            
        }
        return count;
        
        
        
    }
}