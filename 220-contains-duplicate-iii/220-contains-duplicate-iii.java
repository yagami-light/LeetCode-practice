class Solution {
    class numPosVal{
        int value;
        int pos;
        
        numPosVal(int value,int pos){
            this.value=value;
            this.pos=pos;
        }
        
    }
    
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n=nums.length;
        numPosVal[] posArray=new numPosVal[n];
        
        for(int i=0;i<n;i++){
            posArray[i] =new numPosVal(nums[i],i);
        }
        Arrays.sort(posArray,(a,b)->Integer.compare(a.value,b.value));
        
        for(int i=0;i<n;i++){
            // System.out.println("value is :"+posArray[i].value);
            for(int j=i+1;j<posArray.length && ((long)posArray[j].value-(long)posArray[i].value<=(long)t);j++){
                
                if(Math.abs(posArray[j].pos-posArray[i].pos)<=k) return true;
            }
            
        }
        
        return false;
        
        
    }
}