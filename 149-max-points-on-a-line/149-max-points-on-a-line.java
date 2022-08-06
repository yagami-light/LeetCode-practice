class Solution {
    public int maxPoints(int[][] points) {
         if(points==null) return 0;
        
        int length=points.length;
        if(length<=2) return length;
 // Map<Pair<Integer,Integer>, Integer> map = new HashMap();
        int solution=0;
        for(int i=0;i<length;i++){
             // Map<Pair<Integer,Integer>, Integer> map = new HashMap();

                   Map<String,Integer> map=new HashMap();
            int duplicate=0;
            int max=0;
            
            for(int j=i+1;j<length;j++){
                
                int deltaX=points[j][0]-points[i][0];
                int deltaY=points[j][1]-points[i][1];
                if(deltaX==0 && deltaY==0){
                    duplicate++;
                    continue;   
                }
                
                int gcd=generateGCD(deltaX,deltaY);
                // System.out.println("deltax:"+deltaX+"deltaY "+deltaY+" gcd :"+gcd);
                if(gcd!=0){
                 deltaX=deltaX/gcd;
                 deltaY=deltaY/gcd;
                }
                                // Pair<Integer,Integer> line = new Pair(deltaX, deltaY);

                map.put(deltaX+"@"+deltaY,map.getOrDefault(deltaX+"@"+deltaY,0)+1);
                max=Math.max(max,map.get(deltaX+"@"+deltaY));
                
                // map.put(line, map.containsKey(line) ? map.get(line) + 1 : 1);
                // max = Math.max(max, map.get(line));
                
                
            }
            
            solution=Math.max(solution,max+duplicate+1);
            
        }
        
        
        return solution;
        
        
        
        
    }
//     int gcd(int a,int b){
        
//         if(b==0) return a;
        
//         return gcd(b,a%b);
//     }
    
      public int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    
     private int generateGCD(int a, int b){
        return (b == 0) ? a : generateGCD(b, a % b);
    }
    
}