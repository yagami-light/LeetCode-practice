class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList();
        int sum=0;
        Arrays.sort(nums);
        
        
        for(int i=0;i<nums.length-2;i++){
            
            int lo=i+1;
            int hi=nums.length-1;
            sum=0-(nums[i]);
            if(i==0 ||  (i >0 && nums[i] != nums[i-1])){
            while(lo<hi){
                if(nums[lo]+nums[hi]==sum){
                    List<Integer> list=new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[lo]);
                    list.add(nums[hi]);
                    
                    result.add(list);
                    while(lo<hi && nums[lo] == nums[lo+1])
                    lo++;
                     while(lo<hi && nums[hi] == nums[hi-1])
                    hi--;
                    
                    lo++;
                    hi--;
                    
                }
                else if(nums[lo]+nums[hi]>sum)
                    hi--;
                
                else 
                    lo++;
                
            }
            }
            
        }
        
        return result;
        
        
    }
}