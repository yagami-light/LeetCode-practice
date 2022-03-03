class Solution {
    public boolean canFinish(int n, int[][] pre) {
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        int[] visited=new int[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList();
        }
        
        for(int[] node:pre){
            
            graph[node[0]].add(node[1]);
            
        }
        
        for(int i=0;i<n;i++){
            
          if(visited[i]==0){
            if(isCycle(graph,i,visited))
                return false;
          }
            
            
        }
        
        return true;
        
        
    }
    /*
    
    not pro=0
    processing=1
    processed=2
    
    
    */
    
    
    private boolean isCycle(ArrayList<Integer>[] graph,int n, int[] visited){
        
        if(visited[n]==1)
            return true;
        
        visited[n]=1;
        
        for(int i:graph[n]){
            // System.out.println("node "+n+" values"+i);
                if(visited[i]!=2)
                if(isCycle(graph,i,visited))
                    return true;
            
            
        }
        
        visited[n]=2;
        return false;
        
        
        
    }
    
}