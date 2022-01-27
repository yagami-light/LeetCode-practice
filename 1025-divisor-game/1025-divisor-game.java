class Solution {
    public boolean divisorGame(int n) {
        
        if(n==1)
            return false;
        
        if(n==2)
            return true;
        
        return divisorGame(n-2);
        
        
    }
}