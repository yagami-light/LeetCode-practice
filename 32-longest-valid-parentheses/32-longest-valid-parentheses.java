class Solution {
    public int longestValidParentheses(String s) {
        
        Deque<Integer> stack=new LinkedList();
        stack.push(-1);
        
        int maxLength=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                    
                }else{
                    
                    int len=i-stack.peek();
                    maxLength=Math.max(len,maxLength);
                }
                
                
            }
            
            
            
            
        }
        
        
        return maxLength==Integer.MIN_VALUE ? 0 : maxLength;
        
        
        
        
    }
}