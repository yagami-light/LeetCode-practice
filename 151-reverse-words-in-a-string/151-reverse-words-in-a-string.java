class Solution {
    public String reverseWords(String s) {
        char[] input=s.toCharArray();
        reverse(input,0,input.length-1);
        reverseWord(input,0,input.length-1);
        System.out.println("reversed Word :"+new String(input));
        return removeSpaces(input,input.length-1);
        
        // return s;
        
    }
    
    private String removeSpaces(char[] input,int n){
        int i=0,j=0;
        while(j<=n){
            
            while(j<=n && input[j]==' ') j++;
            while(j<=n && i<=n && input[j]!=' ')
                input[i++]=input[j++];
            while(j<=n && input[j]==' ') j++;
            if(j<=n)
            input[i++]=' ';
                
            
            
        }
        return new String(input).substring(0,i);
        
        
        
    }
    
    
    private void reverse(char[] input,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            char temp=input[i];
            input[i]=input[j];
            input[j]=temp;
            i++;
            j--;
            
            
        }
        
        
    }
    
    private void reverseWord(char[] input,int start,int end){
        
        for(int i=start;i<=end;i++){
            
            start=i;
            while(i<=end && input[i]!=' ')
                i++;
            reverse(input,start,i-1);
                
            
        }
        
    }
    
    
}