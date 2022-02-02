class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        long[] prefix=new long[n+1];
        
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        
        System.out.println(Arrays.toString(prefix));
        Deque<Integer> dq=new LinkedList();
        
        for(int i=0;i<n+1;i++){
            
            while(!dq.isEmpty() && prefix[i]-prefix[dq.peek()]  >= k){
                res=Math.min(res,i-dq.remove());
            }
            
            while(!dq.isEmpty() &&  prefix[i] < prefix[dq.peekLast()]){
                dq.removeLast();
            }
            
            dq.add(i);
            
        }
        
        
        
        return res<=n ? res : -1;
        
        
        
    }
    
    /*
    
    0,2,1,3
    
    
    0,1,2
    
    prefix[j] -prefix[i] :  sum[i,j-1] >=k
        
    
    
    
    */
    
    
    
}