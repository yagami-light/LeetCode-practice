class Solution {
    public int maxResult(int[] nums, int k) {
        
        Deque<Integer> dq=new LinkedList();
        int n=nums.length;
        dq.add(0);
        
        for(int i=1;i<n;i++){
            
            nums[i]=nums[i]+nums[dq.peek()];
          
            
            while(!dq.isEmpty() && nums[dq.peekLast()] <=nums[i]){
                
                dq.removeLast();
                
                
            }
            
            dq.addLast(i);
            
            if(i-dq.peekFirst() >= k)
                dq.remove();
            
            
            
            
            
        }
        return nums[n-1];
        
        
        
    }
}