class Solution {
    public boolean isPalindrome(String s) {
        
        
        char[] charArray=s.toCharArray();
        int start=0,end=charArray.length-1;
        int n=charArray.length;
        while(start<end){
            
            while(start<n && !Character.isLetterOrDigit(charArray[start])){
                start++;
            }
            
            
             while(end>0 && !Character.isLetterOrDigit(charArray[end])){
                end--;
            }
            
           System.out.println("start :"+start+" end "+end);
            if(start==n && end==0) return true;
            if(Character.toLowerCase(charArray[start])==Character.toLowerCase(charArray[end])){
                start++;
                end--;
            }else{
                return false;
            }
            
        }
        
        return true;
        
        
    }
}