class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<String> stack=new LinkedList();
        
        for(String str:tokens){
        if(isOperator(str)){
            
            String num2=stack.pop();
            String num1=stack.pop();
            
            String res=calculate(num1,num2,str);
            // System.out.println("res is : "+res+" for num1 "+num1+" and num2 "+num2);
            stack.push(res);
        }else{
            stack.push(str);
        }
        
        }
        
        String res=stack.pop();
        
        return Integer.valueOf(res);
        
        
    }
    
    String calculate(String num1str,String num2str,String op){
        int num1=Integer.valueOf(num1str);
        int num2=Integer.valueOf(num2str);
        switch(op){
            case "+":
                return String.valueOf(num1+num2);
            case "-":
                return String.valueOf(num1-num2);
            case "*":
                return String.valueOf(num1*num2);
            case "/":
                return String.valueOf(num1/num2);
                
                
                
        }
        
        return "-1";
    }
    
    
    
    boolean isOperator(String str){
        
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    
}