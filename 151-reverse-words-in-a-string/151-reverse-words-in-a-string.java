class Solution {
    public String reverseWords(String s) {
        char[] input=s.trim().toCharArray();
        // int i=0,j=input.length-1;
        reverse(input,0,input.length-1);
        
        
        // System.out.println("input now :"+new String(input));
        // int i=0;
        int start=0;
        for(int i=0;i<input.length;i++){
            
            start=i;
            while(i<input.length && input[i]!=' '){
                i++;
            }
            // System.out.println("start is : "+start+" i "+i);
            reverse(input,start,i-1);
            // i++;
            
            
            
        }
        
        return cleanSpaces(input,input.length);
        
        
        // return new String(input);
        
    }
    String cleanSpaces(char[] a, int n) {
    int i = 0, j = 0;
      
    while (j < n) {
      while (j < n && a[j] == ' ') j++;             // skip spaces
      while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
      while (j < n && a[j] == ' ') j++;             // skip spaces
      if (j < n) a[i++] = ' ';                      // keep only one space
    }
  
    return new String(a).substring(0, i);
  }
    
    
    private void reverse(char[] input,int start,int end){
        int i=start,j=end;
        while(i<j){
            char temp=input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;
            j--;
        }
        
    }
    
}