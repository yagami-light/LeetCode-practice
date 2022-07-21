class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //always n1 short
        
        int n1=nums1.length;
        int n2=nums2.length;
        
        
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        
        int lo=0,hi=n1;
        while(lo<=hi){
            
            int mid1=(lo+hi)/2;
            int mid2=(n1+n2)/2-mid1;
            
            
            int L1=mid1==0 ? Integer.MIN_VALUE : nums1[mid1-1];
            int L2=mid2==0 ? Integer.MIN_VALUE : nums2[mid2-1];
            int R1=mid1==n1 ? Integer.MAX_VALUE : nums1[mid1];
            int R2=mid2==n2 ?Integer.MAX_VALUE : nums2[mid2];
            
            if(L1>R2){
                hi=mid1-1;
            }
            else if (L2>R1){
                lo=mid1+1;
            }
            else{
                // return (Math.max(L1,L2) + Math.min(R1, R2)) / 2;
                return (n1+n2)%2 !=0 ? Math.min(R1,R2) : (Math.max(L1,L2) + Math.min(R1,R2))/2.;
            }
            
            
            
            
        }
        
        return -1;
        
        
    }
}