class Solution {
    public int findMaximumXOR(int[] nums) {
        
        int maxResult=0,
            mask=0;
        
        for(int i=31;i>=0;i--){
            
            mask=mask | (1<<i);
            Set<Integer> set=new HashSet();
            
            for(int n:nums){
                int number=n &  mask;
                set.add(number);
            }
            
            
            int greedyTry=maxResult | (1<<i);
            for(int n :set){
                
                int newNumber=n ^ greedyTry;
                if(set.contains(newNumber)){
                    maxResult=greedyTry;
                    break;
                }
                
                
            }
            
            
            }
        
        
        return maxResult;
        
        
    }
}