class Solution {
    public boolean canFinish(int n, int[][] pre) {
        int[] indegree=new int[n];
        ArrayList<Integer>[] graph=new ArrayList[n];
        
        for(int i=0;i<n;i++) graph[i]=new ArrayList();
        for(int i=0;i<pre.length;i++) { 
            graph[pre[i][0]].add(pre[i][1]);
            indegree[pre[i][1]]++;
        }
        
        Queue<Integer> queue=new LinkedList();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                queue.add(i);
        }
        
        int count=0;
        while(!queue.isEmpty()){
            
            int val=queue.remove();
            count++;
            
            for(int i: graph[val]){
                indegree[i]--;
                if(indegree[i]==0)
                    queue.add(i);
            }
            
            
            
            
        }
        
        
        return count==n;
        
        
    }
}