class Solution {
    public int jump(int[] nums) {
        
        int farthestJump=0;
        int jump=0;
        int currEnd=0;
        
        for(int i=0;i<nums.length-1;i++){
            
            farthestJump=Math.max(farthestJump,i+nums[i]);
            if(i==currEnd){
                jump++;
                currEnd=farthestJump;
            }
            
            
        }
        
        return jump;
        
    }
}