class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
        int end=arr.length-k-1;
        
        
        while(start<=end){
            
            
            int mid=(start+end)/2;
            
            if(x > (arr[mid]+(arr[mid+k]-arr[mid])/2))
                start=mid+1;
                
                
                // --------------------------mid--x---midd-----mid+k-----------
                
            else
                end=mid-1;
            
            
        }
        
        return Arrays.stream(arr,start,start+k).boxed().toList();
        
    }
}