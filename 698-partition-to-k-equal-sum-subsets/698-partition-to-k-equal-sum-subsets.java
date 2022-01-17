class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int c:nums)
            sum+=c;
        
        
        if(k<=0 || sum %k !=0)
            return false;
        // System.out.println("test");
        
        int n=nums.length;
        int[] visited=new int[n];
        
        return canPartKSubUtil(nums,0,k,sum/k,0,0,visited);
        
        
        
    }
    
    
    
 
    
    
    private boolean canPartKSubUtil(int[] nums, int index,int k,int targetSum,int currSum,int curNum,int[] visited){
        
        if(k==1)
            return true;
        
        if(currSum == targetSum && curNum >0)
            return canPartKSubUtil(nums,0,k-1,targetSum,0,curNum,visited);
        
        for(int i=index;i<nums.length;i++){
            if(visited[i]==0){
                visited[i]=1;
                if(canPartKSubUtil(nums,i+1,k,targetSum,currSum+nums[i],curNum++,visited))
                    return true;
                
                visited[i]=0;
                
                
                
            }
            
            
            
        }
        
        
        return false;
        
        
        
    }
    
    
    
    
    
}