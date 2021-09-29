class Solution {
    public char nextGreatestLetter(char[] a, char x) {
     if (x >= a[a.length - 1])  return a[0];
       
        return nextGreatestLetter(a,x,0,a.length-1);
    }
    
    
    private char nextGreatestLetter(char[] letters,char target, int start,int end){
          
        if(start>end)
                return letters[start];
            int mid=(start+end)/2;
        
        
            if(letters[mid]>target){
                 
              return  nextGreatestLetter(letters,target,start,mid-1);
            }
        
             else
              return   nextGreatestLetter(letters,target,mid+1,end);
        
    
        
        
        
    }
    
}