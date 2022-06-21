class Solution {
    public String simplifyPath(String path) {
        String[] pathArray=path.split("/");
        System.out.println("toString array :"+Arrays.toString(pathArray));
        List<String> result=new ArrayList();
        // result.add("/");
        // StringBuilder str=new StringBuilder("/");
        for(int i=0;i<pathArray.length;i++){
            

            if(pathArray[i].length()==0|| pathArray[i].equals(".")) continue;
            if(pathArray[i].equals("..")){
                System.out.println("print is for ..");
                if(result.size()>0)
                    result.remove(result.size()-1);
                continue;
            }
            System.out.println("printing ..:"+pathArray[i]);

            result.add(pathArray[i]);
//             if(i!=pathArray.length-1)
//             result.add("/");
            
        }
        
        System.out.println("printing result list :"+result);
        // result.add(0,"/");
        return result.stream().collect(Collectors.joining("/","/",""));
        
//         for(String str:pathArray){
//             if(str.length()==0|| str.equals(".")) continue;
//             str.append(str);
//             str.append("/");
//         }
        
        
        // return "test";
    }
}