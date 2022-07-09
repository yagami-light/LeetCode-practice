class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        Set<String> res=new HashSet();
        StringBuilder str=new StringBuilder(s);
        restoreIpAddressesBackTrack(s,res,str,0,3);
        // System.out.println(isVallidIpAddress("1.01.02.3"));
        // System.out.println("parsing : "+Integer.parseInt("01"));
        return new ArrayList(res);
    }
    
    private void restoreIpAddressesBackTrack(String s,Set<String> res,StringBuilder str,int index,int dotCount){
        // System.out.println("dot Count :"+dotCount+" index "+index +" stringBuilder :"+str);
        if(dotCount<0 || index>=s.length()) return;
        
        if(dotCount==0 && isVallidIpAddress(str.toString())){
            res.add(str.toString());
            return;
        }
        
        for(int i=index;i<=s.length();i++){
            
            str.insert(i,".");
            restoreIpAddressesBackTrack(s,res,str,index+1,dotCount-1);
            str.deleteCharAt(i);
            
            
        }
        
        
        
        
        
    }

    
    
    
    private boolean isVallidIpAddress(String s){
        String[] splittedIp=s.split("\\.");
        // System.out.println("length is "+splittedIp.length);
        if(splittedIp.length !=4)
            return false;
        for(String str: splittedIp){
            // System.out.println(" str is :"+str);
            if(str.length()==0) return false;
            if(!str.equals("0") && str.startsWith("0")) return false;
            long num=Long.parseLong(str);
            if(num>=0 && num<=255) continue;
            else
                return false;
            
            
        }
        return true;
        
        
    }
    
}