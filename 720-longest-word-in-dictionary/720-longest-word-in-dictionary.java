class Solution {
    public String longestWord(String[] words) {
        
        Arrays.sort(words);
        Set<String> set=new HashSet();
        System.out.println("print array :"+Arrays.toString(words));
        
        String res="";
        
        for(String w:words){
            
            System.out.println("given string "+w);
            System.out.println("sub string : "+w.substring(0,w.length()-1));
            
            if(w.length() == 1 || set.contains(w.substring(0,w.length()-1))){
                
                
                res = w.length() > res.length() ? w : res;
                System.out.println("res add :"+res);
                set.add(w);
            }
        }
        
        
        return res;
        
    }
    
    
  /*   public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }
    
    
    */
    
}