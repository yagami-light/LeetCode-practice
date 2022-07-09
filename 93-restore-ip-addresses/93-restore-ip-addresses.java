class Solution {
    public List<String> restoreIpAddresses(String s) {
        int len=s.length();
        List<String> res=new ArrayList();
        for(int i=1;i<=3;i++){
            
            for(int j=1;j<=3;j++){
                
                for(int k=1;k<=3;k++){
                    
                    
                    for(int l=1;l<=3;l++){
                        
                        if(i+j+k+l == s.length()){
                            
                            
                            int int1=Integer.parseInt("0"+s.substring(0,i));
                            int int2=Integer.parseInt("0"+s.substring(i,i+j));
                            int int3=Integer.parseInt("0"+s.substring(i+j,i+j+k));
                            int int4=Integer.parseInt("0"+s.substring(i+j+k));
                            // if()
                            if(int1<=255 && int2<=255 && int3<=255 && int4<=255){
                                if((""+int1+"."+int2+"."+int3+"."+int4).length() == s.length()+3)
                                res.add(""+int1+"."+int2+"."+int3+"."+int4);
                            }
                            
                        }
                        
                    }
                    
                    
                }
                
            }
            
        }
        return res;
        
    }
}