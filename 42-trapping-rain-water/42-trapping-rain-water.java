class Solution {
    public int trap(int[] height) {
        
        int maxL=height[0];
        int maxR=height[height.length-1];
        int left=0;
        int right=height.length-1;
        int ans=0;
        
        while(left<right){
            // System.out.println("left height "+height[left]+" right height "+height[right]+"  max Lefgt "+maxL+" max right "+maxR);
            
           if(maxL < maxR){
               left++;
               maxL=Math.max(maxL,height[left]);
               ans+=maxL-height[left];
               
               
               
               
           } else{
               right--;
               maxR=Math.max(maxR,height[right]);
               ans+=maxR-height[right];
               
           }
           
            
        }
        return ans;
        
        
    }
}