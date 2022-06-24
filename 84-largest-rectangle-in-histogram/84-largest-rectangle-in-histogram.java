class Solution {
    public int largestRectangleArea(int[] nums) {
        
        return largestRectangleAreaUtil(nums,0,nums.length-1);
    }
    
    private int largestRectangleAreaUtil(int[] nums,int start,int end){
        if(start==end)
            return nums[start];
        
        int mid=(start+end)/2;
        
        
        int area1=largestRectangleAreaUtil(nums,start,mid);
        int area2=largestRectangleAreaUtil(nums,mid+1,end);
        
        int area3=calculateMidArea(nums,start,end,mid);
        
        return Math.max(area3,Math.max(area1,area2));
        
    }
    
    private int calculateMidArea(int[] nums,int start,int end,int mid){
        int i=mid;
        int j=mid+1;
        int minHeight=Math.min(nums[i],nums[j]);
        int width=2* minHeight;
        int area=0;
        while(i>=start && j<=end){
            
            minHeight=Math.min(minHeight,Math.min(nums[i],nums[j]));
            area=Math.max(area,minHeight * (j-i+1));
            if(i==start)
                j++;
            else if(j==end)
                i--;
            else if(nums[i-1] <= nums[j+1])
                j++;
            else
                i--;
            
            
        }
        
        
        return area;
        
        
    }
    
    
    
    
}