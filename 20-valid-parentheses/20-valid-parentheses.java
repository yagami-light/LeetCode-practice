class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st=new Stack();
        
        for(char c: s.toCharArray()){
            
             if((c==')' || c =='}' || c==']') && st.isEmpty())
                 return false;
            
            if(c=='(' || c =='{' || c=='[')
                st.push(c);
            
            if((c==')' || c =='}' || c==']') && !isMatched(c,st.pop()))
               return false;
            
            
            
        
        
        
       
        
    }
        // System.out.println("stack"+st);
         return st.isEmpty();
}
    
    private boolean  isMatched(char p, char c){
        // System.out.println("c" +c +" p"+p);
        if(c=='(' && p==')'){
            // System.out.println("returnihng");
            return true;
            
        }
         if(c=='[' && p==']')
            return true;
         if(c=='{' && p=='}')
            return true;
        
        return false;
        
        
    }
               
               
}             