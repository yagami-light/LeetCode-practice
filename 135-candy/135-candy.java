class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int total=0;
        int[] left=new int[n];
        Arrays.fill(left,1);
        
        int[] right=new int[n];
        Arrays.fill(right,1);
        
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                left[i]=1+Math.max(left[i],left[i-1]);
            }
        }
        
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                right[i]=1+Math.max(right[i],right[i+1]);
                }
        }
        
        for(int i=0;i<n;i++){
            total+=Math.max(left[i],right[i]);
        }
        
        return total;
        
    }
}