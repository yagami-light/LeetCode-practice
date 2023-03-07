class Solution {
    public int findMin(int[] nums) {
        
        int start=0,end=nums.length-1;
        if(start==end) return nums[0];

        return binSearch(nums,start,end);
    }

    private int binSearch(int[] nums,int start,int end){

        if(start>end) return -1;
        if(start==end) return nums[start];

        int mid=(start+end)/2;
        if(nums[mid]>nums[end] ){
            return binSearch(nums,mid+1,end);
        }
        else{
            return binSearch(nums,start,mid);
        }


    }

}


/*

[2,1]
start=0,end=1
mid=0


*/