class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        
        int[] pos=new int[num1.length()+num2.length()];
        
        
        for(int i=num1.length()-1;i>=0;i--){
            
            
            for(int j=num2.length()-1;j>=0;j--){
                
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                
                int sum=pos[i+j+1]+mul;
                                pos[i+j]+=sum/10;

                pos[i+j+1]=sum%10;
                
                
                /*
                
                23/10=2
                23%10=3
                
                
                */
                
                
                
                
                
            }
            
            
        }
        StringBuilder str=new StringBuilder();
        System.out.println("print array "+Arrays.toString(pos));
        for(int i=0;i<pos.length;i++){
            
            if(pos[i]==0 && i==0)
                continue;
            str.append(pos[i]);
            
        }
        return str.toString();
        
        
    }
}