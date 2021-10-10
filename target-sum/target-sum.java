class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] result=new int[1];
        int currentSum=0;
        backTrack(nums,target,currentSum,"",result,0);
        
        return result[0];
    }
    
    
    
    private void backTrack(int[] nums,int target,int currentSum,String currentString,int[] result,int index){
       
        if(index==nums.length && currentSum==target){
                    // System.out.println("matched currentSum "+currentSum +" number index"+index+"number length "+nums.length);
            // System.out.println("currentString "+currentString);

            result[0]++;
        }
         if(index==nums.length)
            return;
        // System.out.println("currentSum "+currentSum +" number "+nums[index]);
        backTrack(nums,target,currentSum+nums[index],currentString,result,index+1);
        backTrack(nums,target,currentSum-nums[index],currentString,result,index+1);
        
        
        
    }
}