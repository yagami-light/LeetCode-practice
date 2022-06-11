class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        
        int len1=num1.length();
        int len2=num2.length();
        
        int index1=0,index2=0;
        String res="";
                    int index=0;

        for(int i=len1-1;i>=0;i--){
            
            int carry=0;
            int m=num1.charAt(i)-'0';
            String curr_ans="";
            
            for(int j=len2-1;j>=0;j--){
                
                int n=num2.charAt(j)-'0';
                int mul=(m*n)+carry;
                 carry=mul / 10;
                curr_ans=(mul % 10)+""+curr_ans;
                
                
            }
            if(carry>0){
                // System.out.println("carry is "+carry);
                curr_ans=carry+""+curr_ans;
            }
            for(int k=0;k<index;k++){
                curr_ans=curr_ans+"0";
            }
            index++;
            // System.out.println("idnex is "+index);
            // System.out.println("res "+res+" curr_ans "+curr_ans );
            res=stringSum(res,curr_ans);
            
        }
             
            
            return res;
        
        
    }
    
    private String stringSum(String num1,String num2){
        
        if(num1.length()==0 ) return num2;
        if(num2.length()==0) return num1;
        int index1=num1.length()-1,index2=num2.length()-1;
        int carry=0;
        String ans="";
        while(index1>=0|| index2 >=0){
            
            int num1int=index1<0 ? 0 : num1.charAt(index1--)-'0';
            int num2int=index2<0 ? 0 : num2.charAt(index2--)-'0';
            
            int digit=(num1int+num2int)+carry;
            ans=(digit% 10)+ans;
            carry=digit/10;
            // index1--;
            // index2--;
            
            
        }
        // System.out.println("sum "+ans);
        
        if(carry>0)
            ans=carry+ans;
        
        
        return ans;
        
        
    }
    
}