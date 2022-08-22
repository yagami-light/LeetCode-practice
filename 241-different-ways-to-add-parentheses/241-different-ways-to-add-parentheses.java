class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer>  res=new ArrayList();
        int n=exp.length();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='*' || ch=='-' ||  ch=='+'){
                
                String str1=exp.substring(0,i);
                String str2=exp.substring(i+1);
                List<Integer> res1=diffWaysToCompute(str1);
                List<Integer> res2=diffWaysToCompute(str2);
                
                for(int n1:res1){
                    
                    for(int n2:res2){
                        
                        if(ch=='-'){
                            res.add(n1-n2);
                        }
                        else if(ch=='+'){
                            res.add(n1+n2);
                            
                        }
                        else if(ch=='*'){
                            res.add(n1*n2);
                        }
                        
                    }
                }
                
            }
           
        }
         if(res.size()==0)  res.add(Integer.valueOf(exp));
        return res;
        
    }
}