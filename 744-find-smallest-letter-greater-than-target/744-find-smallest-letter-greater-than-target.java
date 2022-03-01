class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
                if(letters[letters.length-1]<=target) return letters[0];

        return nextGreatChar(letters,target,0,letters.length-1);
        
    }
    
    
    private char nextGreatChar(char[] let,char target,int start,int end){
        if(start>end)
            return let[start];
        
        int mid=(start+end)/2;
        char midChar=let[mid];
        
        if(midChar<=target){
            return nextGreatChar(let,target,mid+1,end);
        }else
            return nextGreatChar(let,target,start,mid-1);
        
        
        
    }
    
    
}