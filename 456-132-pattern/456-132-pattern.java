class Solution {
    public boolean find132pattern(int[] nums) {
        
        int secondMax=Integer.MIN_VALUE;
        Stack<Integer> stack=new Stack();
        for(int i=nums.length-1;i>=0;i--){
            
            if(nums[i]<secondMax) return true;
            
            while(!stack.isEmpty() && stack.peek()<nums[i]){
                secondMax=Math.max(secondMax,stack.pop());
            }
                
                
            stack.push(nums[i]);
            
            
        }
        return false;
        
        
    }
}