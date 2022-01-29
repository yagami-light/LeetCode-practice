class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> pq=new LinkedList();
        int[] res=new int[nums.length-k+1];
        int l=0;
        for(int i=0;i<nums.length;i++){
            
            
            while(!pq.isEmpty() && pq.peekFirst() <= i-k){
                pq.removeFirst();
            }
            
            while(!pq.isEmpty() && nums[pq.peekLast()] < nums[i]){
                pq.removeLast();
            }
            
            
            pq.add(i);
            
            if(i>=k-1){
                res[l++]=nums[pq.peekFirst()];
            
            }
            
            
        }
        
        return res;
        
        
        
    }
}