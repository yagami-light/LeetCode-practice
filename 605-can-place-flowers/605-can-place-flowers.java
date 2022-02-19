class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        
        
        
        
        int len=flowerbed.length;
        if(len==1 && n==1 && flowerbed[0]==0)
            return true;
        
        for(int i=0;i<len;i++){
                   // System.out.println(Arrays.toString(flowerbed) + " n "+n);
 
            if(flowerbed[i]==1)
                continue;
            
           else  if(i>0 && flowerbed[i-1]==0 && i<len-2 && flowerbed[i+1]==0){
               
                    flowerbed[i]=1;
                    n--;
           }
                
           else if(i==0 && i<len-2 && flowerbed[i+1]==0){
               flowerbed[i]=1;
               n--;
            
           }
             else if(i==len-1 && i>0 && flowerbed[i-1]==0){
               flowerbed[i]=1;
                 n--;
            
           }
                
           
            
            
            
        }
        
        System.out.println(Arrays.toString(flowerbed));
        if(n>0)
            return false;
        else
            
            return true;
        
        
    }
}