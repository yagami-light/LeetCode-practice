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
            
            if(isCycle(graph,visited,i))
                return false;
            
            
        }
        return true;
        
        
    }
    
    private boolean isCycle(ArrayList<Integer>[] graph,int[] visited,int index){
        if(visited[index]==1)
            return true;
        
        visited[index]=1;
        
        for(int i: graph[index]){
            
            if(visited[i] != 2){
                
                if(isCycle(graph,visited,i))
                    return true;
                
            }
            
        }
        visited[index]=2;
        return false;
        
        
        
    }
    
    
}