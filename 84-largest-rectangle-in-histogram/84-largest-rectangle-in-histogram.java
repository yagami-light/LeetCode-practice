class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n=heights.length;
        if(n==1)
            return heights[0];
        
        int[] leftMinIndex=new int[n];
        int[] rightMinIndex=new int[n];
        int area=0;
        leftMinIndex[0]=-1;
        for(int i=1;i<n;i++){
            int p=i-1;
            
            while(p>=0 && heights[p]>=heights[i])
                p=leftMinIndex[p];
            
            leftMinIndex[i]=p;
            
        } 
        
        // System.out.println("left min array :"+Arrays.toString(leftMinIndex));
         rightMinIndex[n-1]=n;
        for(int i=n-2;i>=0;i--){
            // System.out.println("alex");
            int p=i+1;
            
            while(p<heights.length && heights[p]>=heights[i]){
                p=rightMinIndex[p];
                         // System.out.println("alex2");
   
            }
            
            rightMinIndex[i]=p;
            
        }
          
                // System.out.println("right min array :"+Arrays.toString(rightMinIndex));

        
        rightMinIndex[n-1]=n;
        
        for(int i=0;i<heights.length;i++){
            
            area=Math.max(area,heights[i]*(rightMinIndex[i]-leftMinIndex[i]-1));
            
        }
        
        
        return area;
        
        
    }
}