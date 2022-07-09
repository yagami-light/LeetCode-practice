class Solution {
    
    public List<String> restoreIpAddresses(String s) {
    List<String> res = new ArrayList<String>();
    int len = s.length();
    //i < 4 保证第一部分不超过 3 位数
    //i < len - 2 保证剩余的字符串还能分成 3 部分
    for(int i = 1; i<4 && i<len-2; i++){
        for(int j = i+1; j<i+4 && j<len-1; j++){
            for(int k = j+1; k<j+4 && k<len; k++){
                //保存四部分的字符串
                String s1 = s.substring(0,i), s2 = s.substring(i,j), s3 = s.substring(j,k), s4 = s.substring(k,len);
                //判断是否合法
                if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                    res.add(s1+"."+s2+"."+s3+"."+s4);
                }
            }
        }
    }
    return res;
}
public boolean isValid(String s){
    if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
        return false;
    return true;
}

    
    public List<String> restoreIpAddresses2(String s) {
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