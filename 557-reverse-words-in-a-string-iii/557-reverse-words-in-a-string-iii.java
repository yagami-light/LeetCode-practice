class Solution {
    public String reverseWords(String s) {
        
      String[] input=s.split(" ");
      
      return Arrays.stream(input).map(str->reverseString(str)).collect(Collectors.joining(" "));  
        
        
        
    }
    
    
    private String reverseString(String s){
        
        char[] array=s.toCharArray();
        int start=0;
        int end=array.length-1;
        System.out.println("input :"+ s);
        
        while(start<end){
            
//             while(!Character.isAlphabetic(array[start]))
//                 start++;
            
//             while(!Character.isAlphabetic(array[end]))
//                 end--;
            
            System.out.println("start char "+array[start]+" end char "+array[end]);
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            
            start++;
            end--;
            
        }
        
        
        return new String(array);
        
        
        
        
        
    }
    
}