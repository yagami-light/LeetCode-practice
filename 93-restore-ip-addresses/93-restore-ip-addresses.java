class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res=new ArrayList();
        for(int i=0;i<=255;i++){
            if(s.startsWith(i+"")){
                // System.out.println(" i is :"+i);
            for(int j=0;j<=255;j++){
                if(s.startsWith(""+i+j)){
                                    // System.out.println(" i+j is :"+i+j);

                for(int k=0;k<=255;k++){
                    if(s.startsWith(""+i+j+k)){
                    // System.out.println(" i+j+k is :"+i+j+k);

                    for(int l=0;l<=255;l++){
                        // System.out.println(" i+j+k+l is :"+i+j+k+l);
    
                        if(s.equals(""+i+j+k+l))
                            res.add(i+"."+j+"."+k+"."+l);
                    }
                    }
                }
            }
            }
            } 
        }
        
        return res;
        
        
    }
}