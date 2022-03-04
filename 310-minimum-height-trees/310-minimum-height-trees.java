class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] e) {
        
        if(n<=0) return new ArrayList();
        
        if(n==1) return new ArrayList(Arrays.asList(0));
        
        
        int[] indegree=new int[n];
        List<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList();
        
        for(int i=0;i<e.length;i++){
            
            graph[e[i][0]].add(e[i][1]);
            graph[e[i][1]].add(e[i][0]);
            indegree[e[i][1]]++;
            indegree[e[i][0]]++;

            
        }
                List<Integer>  res=new ArrayList();
        System.out.println(Arrays.toString(indegree));
        
        int[] cloned=Arrays.copyOf(indegree,n);
        Arrays.sort(cloned);
        boolean isEven=(n%2==0);
      

        Queue<Integer> queue=new LinkedList();
        for(int i=0;i<n;i++){
            if(indegree[i]==1){
                queue.add(i);
                // res.add(i);   
            }
        }
        
        
        while(n >2){
            int size=queue.size();
            n-=size;
            while(size-->0){
            int val=queue.remove();
            for(int i:graph[val]){
                indegree[i]--;
                if(indegree[i]==1)
                    queue.add(i);
            }
            
            // if(queue.isEmpty()|| queue.size()==1){
            //     res.add(val);
            // }
            
           
            System.out.println(val);
            
        }
        }
        
        return queue.stream().toList();
        
        
        
        
        
        
        
        
    }
}