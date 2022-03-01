class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        if(letters[letters.length-1]<=target)
            return letters[0];
        
        return  nextGreatLet(letters,target,0,letters.length-1);
    }
    
    private char nextGreatLet(char[] let,char target, int start,int end){
        if(start>end)
            return let[start];
            
        
        int mid=(start+end)/2;
        
        if(let[mid]<=target){
            return nextGreatLet(let,target,mid+1,end);
        }else
            return nextGreatLet(let,target,start,mid-1);
        
        
        
    }
    
}