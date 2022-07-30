class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] cut=new int[n+1];
        
        for(int i=0;i<=n;i++){
            cut[i]=i-1;
        }
        
        System.out.println("print cut :"+Arrays.toString(cut));
        
        for(int i=0;i<n;i++){
            
            for(int j=0;i-j>=0 && i+j<n && s.charAt(i-j)==s.charAt(i+j);j++)
                cut[i+j+1]=Math.min(cut[i+j+1],1+cut[i-j]);
            
             for(int j=1;(i-j+1)>=0 && i+j<n && s.charAt(i-j+1)==s.charAt(i+j);j++)
                cut[i+j+1]=Math.min(cut[i+j+1],1+cut[i-j+1]);
            
            
            
        }
        
        return cut[n];
        
        
        
    }
}