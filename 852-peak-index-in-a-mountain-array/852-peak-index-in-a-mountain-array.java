class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])
                return i-1;
            
        }
        return -1;
        
    }
    
    private int peakIndexInMountArray(int[] arr, int start, int end){
        
        return -1;
    }
       
    
    
    
}