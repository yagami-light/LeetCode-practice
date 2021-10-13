class Solution {
    public int maxProduct(int[] nums) {
     
        return maxProductUtil(nums);
    }
    
    
    
    private int maxProductUtil(int[] nums){
        int minHerePre=nums[0];
        int maxHerePre=nums[0];
        int res=nums[0];
        int maxHere=Integer.MIN_VALUE,minHere=Integer.MAX_VALUE;
        
        for(int i=1;i<nums.length;i++){
            
            
            maxHere=Math.max(maxHerePre*nums[i],Math.max(nums[i],minHerePre*nums[i]));
            minHere=Math.min(maxHerePre*nums[i],Math.min(nums[i],minHerePre*nums[i]));
            res=Math.max(maxHere,res);
            maxHerePre=maxHere;
            minHerePre=minHere;                 
                             
            
        }
        
        return res;                             

        
    }
                             
                             
    
    
}