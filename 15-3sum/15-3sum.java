class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            
            int start=i+1;
            int end=n-1;
            int sum=0-nums[i];
           if(i==0 || (i>0 && (nums[i] != nums[i-1]))){
            while(start<end){
                
                if(nums[start]+nums[end]==sum){
                    result.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1])
                        start++;
                    while(start<end && nums[end]==nums[end-1])
                        end--;
                    start++;
                    end--;
                }
                else  if(nums[start]+nums[end] < sum){
                    start++;
                }
                else if(nums[start]+nums[end] > sum){
                    end--;
                    
                    
                }
                
                
                
                
            }   
            }
            
            
            
            
        }
        
        
        return result;
        
        
        
        
    }
}

/*


 [-1,0,1,2,-1,-4]
 [-4,-1,-1,0,1,2]

*/