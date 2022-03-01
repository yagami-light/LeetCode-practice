class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        return nextGreatLet(letters,target,0,letters.length-1);
    }
    
    
    private char nextGreatLet(char[] letters, char target,int start,int end){
        // System.out.println("start "+start+" end "+end+"target "+target);
        if(start==end && target < letters[start])
            return letters[start];
        else if(start==end && target >= letters[start])
            return letters[(start+1)%letters.length];
         
        int mid=(start+end)/2;
        char midChar=letters[mid];
        
        if(midChar<=target){
            
            return nextGreatLet(letters,target,mid+1,end);
        }else if(midChar>target){
            
            return nextGreatLet(letters,target,start,mid);
        }
        return letters[end];
        
        
        
    }
    
}