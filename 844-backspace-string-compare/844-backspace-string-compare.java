class Solution {
    public boolean backspaceCompare(String s, String t) {
        int m=s.length()-1;
        int n=t.length()-1;
        
        
        while(true){
            int backspace=0;
            while(m>=0 && (backspace>0 || s.charAt(m)=='#')){
                
                backspace += s.charAt(m)=='#' ? 1 :-1;
                m--;
                
            }
            System.out.println("m is :"+m);
            
            backspace=0;
              while(n>=0 && (backspace>0 || t.charAt(n)=='#')){
                
                backspace += t.charAt(n)=='#' ? 1 :-1;
                n--;
                
                
                
            }
            System.out.println("nis :"+n);

            if(m>=0 && n>=0 && s.charAt(m)==t.charAt(n)){
                m--;
                n--;
            }else{
                break;
            }
            
            
            
        }
        
        return m==-1 && n==-1;
        
        
        
        
        
    }
}