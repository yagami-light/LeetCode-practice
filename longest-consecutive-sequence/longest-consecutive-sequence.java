class Solution {
    public int longestConsecutive(int[] nums) {
     
        return lcaFindMemory(nums);
    }
    
    
    private int lcaFindMemory(int[] nums){
         if(nums.length==0)
            return 0;
        Set<Integer> set= Arrays.stream(nums).boxed().sorted().collect(Collectors.toSet());
        int longest=0;
        
        for(int i:nums){
            if(!set.contains(i-1)){
                int length=1;
                int next=i+1;
                while(set.contains(next)){
                    length++;
                    next++;
                }
                
                longest=Math.max(longest,length);
                
                
            }
        }
        
        return longest;
       
        }
        
    
    
    
    
    private int lcFind(int[] nums){
         if(nums.length==0)
            return 0;
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
        // System.out.println("min value "+min+" max value"+max);
        int length=0;
        int maxLength=0;
        Set<Integer> set= Arrays.stream(nums).boxed().sorted().collect(Collectors.toSet());
        // System.out.println("set print "+set);
         for(int i=min;i<=max;i++){
             // System.out.println("index i " +i);
             if(set.contains(i)){
                 // System.out.println("element i "+i+" length value "+length);
                 length++;
             }
             else{
                 maxLength=Math.max(maxLength,length);
                 length=0;
                 
             }
                
         }
        // System.out.println("maxLength "+maxLength +"length "+length);
           maxLength=Math.max(maxLength,length);
        return maxLength;
    }
}