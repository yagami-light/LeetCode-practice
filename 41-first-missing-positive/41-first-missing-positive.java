class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            
            int index=nums[i];
            while(index-1>=0 && index-1<nums.length && nums[index-1]!=index){
                int temp=nums[index-1];
                nums[index-1]=index;
                index=temp;
            }
            
        }
        
        
        
        for(int i=0;i<nums.length;i++){
            
            
            if(i+1!=nums[i]) return i+1;
            
        }
        
        return nums.length+1;
        
    }
}