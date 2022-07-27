class Solution {
    public boolean isPalindrome1(String s) {
        
        
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
    
    public boolean isPalindrome(String s) {
        
        String str1=s.chars().mapToObj(c->(char)c).filter(Character::isLetterOrDigit).map(i->i.toString().toLowerCase()).collect(Collectors.joining(""));
        System.out.println("string 1 "+str1);
        
        return str1.equals((new StringBuilder(str1)).reverse().toString());
    }
    
}