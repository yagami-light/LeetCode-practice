class Solution {
    public int largestRectangleArea(int[] heights) {
        
        
        return largestRectangleAreaUtil(heights,0,heights.length-1);
        
    }
    
    private int largestRectangleAreaUtil(int[] nums,int start,int end){
        if(start==end)
            return nums[start];
        
        int mid=(start+end)/2;
        
        
        int left=largestRectangleAreaUtil(nums,start,mid);
        
        
        int right=largestRectangleAreaUtil(nums,mid+1,end);
        
        int middle=calculateMiddle(nums,start,end,mid);
        
        
        return Math.max(middle,Math.max(left,right));
        
    }
    
    
    
    private int calculateMiddle(int[] nums,int start,int end,int mid){
        int i=mid;
        int j=mid+1;
        
        
        int minH=Math.min(nums[i],nums[j]);
        int area=minH * 2;
        
        while(i>=start && j<=end){
            minH=Math.min(minH,Math.min(nums[i],nums[j]));
            area=Math.max(area,minH * (j-i+1));
            if(i==start){
                j++;
            }else if(j==end){
                i--;
            }
            else if(nums[i-1]>=nums[j+1]){
                i--;
                
            }else
                j++;
        }
        
        
        return area;
    }
    
    
}