class Solution {
    public int maximalRectangle(char[][] matrix) {
        int area=0;
        int numCol=matrix[0].length;
        int numRow=matrix.length;
        int[] heights=new int[numCol];
        
        for(int row=0;row<numRow;row++){
            
            for(int col=0;col<numCol;col++){
                
                if(matrix[row][col]=='1')
                    heights[col]=1+heights[col];
                else
                    heights[col]=0;
                
            }
            
            area=Math.max(area,rectableAra(heights));
            
            
        }
        
        return area;
    }
    
    private int rectableAra(int[] heights){
        int n=heights.length;
        
        int[] minLeft=new int[n];
        int[] minRight=new int[n];
        Stack<Integer> stack=new Stack();
        int count=n-1;
        int area=0;
        for(int i=n-1;i>=0;i--){
            
           while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
               stack.pop();
            
            if(stack.isEmpty()){
                minRight[count--]=n-1;
            }else{
                minRight[count--]=stack.peek()-1;    
            }
            
            stack.push(i);
            
            
        }
       
        
        System.out.println("pringing minRight :"+Arrays.toString(minRight));
        stack.clear();
        
        for(int i=0;i<n;i++){
            
           while(!stack.isEmpty() && heights[stack.peek()] >= heights[i])
               stack.pop();
            
            if(stack.isEmpty()){
                minLeft[i]=0;
            }else{
                minLeft[i]=stack.peek()+1;    
            }
            
                stack.push(i);

        }
         // minRight[n-1]=n;
        // minLeft[0]=0;
        System.out.println("pringing minLeft :"+Arrays.toString(minRight));

        for(int i=0;i<n;i++){
            
            area=Math.max(area,heights[i]*(minRight[i]-minLeft[i]+1));
            
        }
        
        return area;
        
        
    }
    
    
}