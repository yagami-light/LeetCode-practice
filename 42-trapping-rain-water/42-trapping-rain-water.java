class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack();
        int curr=0,water=0;
        while(curr<height.length){
            while(!stack.isEmpty() && height[curr]>height[stack.peek()]){
                int top=stack.pop();
                if(stack.isEmpty()) break;
                int d=curr-stack.peek()-1;
                int fill=d * (Math.min(height[curr],height[stack.peek()])-height[top]);
               water+=fill;
            }
            
            
             stack.push(curr++);
        }
        
        return water;
        
    }
}