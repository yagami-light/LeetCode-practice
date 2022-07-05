class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list=new ArrayList();
      for(String str:getListForGrayCode(n,list)){
          list.add(Integer.parseInt(str,2));
      }
       System.out.println(getListForGrayCode(n,list));
        
        return list;
    }
    
    
     List<String> getListForGrayCode(int n,List<Integer> result){
            if(n==1){
                List<String> result1=new ArrayList();
                result1.add("0");
                result1.add("1");
                return (result1);
            }
         else{
              List<String> newResult=new ArrayList();
             for(String str: getListForGrayCode(n-1,result)){
                 // result.remove(str);
                 newResult.add("0"+str);
             }
             List<String> iter=getListForGrayCode(n-1,result);
             Collections.reverse(iter);
             for(String str:iter){
                
                 // result.remove(str);

                 newResult.add("1"+str);

               
             }
             
               return newResult;
             
             
         }
        }
        
    
}