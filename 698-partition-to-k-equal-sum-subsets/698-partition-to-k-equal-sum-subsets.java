class Solution {
//     public boolean canPartitionKSubsets(int[] nums, int k) {
//         int sum=0;
//         for(int c:nums)
//             sum+=c;
        
        
//         if(k<=0 || sum %k !=0)
//             return false;
//         // System.out.println("test");
        
//         int n=nums.length;
//         int[] visited=new int[n];
        
//         return canPartKSubUtil(nums,0,k,sum/k,0,0,visited);
        
        
        
//     }
    
    
    
 
    
    
//     private boolean canPartKSubUtil(int[] nums, int index,int k,int targetSum,int currSum,int curNum,int[] visited){
        
//         if(k==1)
//             return true;
        
//         if(currSum == targetSum && curNum >0)
//             return canPartKSubUtil(nums,0,k-1,targetSum,0,curNum,visited);
        
//         for(int i=index;i<nums.length;i++){
//             if(visited[i]==0){
//                 visited[i]=1;
//                 if(canPartKSubUtil(nums,index+1,k,targetSum,currSum+nums[i],curNum++,visited))
//                     return true;
                
//                 visited[i]=0;
                
                
                
//             }
            
            
            
//         }
        
        
//         return false;
        
        
        
//     }
    
    
    
    
      public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int num:nums)sum += num;
        if(k <= 0 || sum%k != 0)return false;
        int[] visited = new int[nums.length];
        return canPartition(nums, visited, 0, k, 0,sum/k);
    }
    
    public boolean canPartition(int[] nums, int[] visited, int start_index, int k, int cur_sum, int target){
        if(k==1)return true;
        if(cur_sum == target)return canPartition(nums, visited, 0, k-1, 0, target);
        for(int i = start_index; i<nums.length; i++){
            if(visited[i] == 0){
                visited[i] = 1;
                if(canPartition(nums, visited, i+1, k, cur_sum + nums[i], target))return true;
                visited[i] = 0;
            }
        }
        return false;
    }
    
    
    
}