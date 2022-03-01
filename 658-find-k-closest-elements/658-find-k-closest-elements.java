class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(Integer.compare(b[1],a[1])==0 ? Integer.compare(b[0],a[0]) : Integer.compare(b[1],a[1])));
        
        
        for(int n:arr){
            
            pq.add(new int[]{n,Math.abs(x-n)});
            // System.out.println("pq "+pq);
            if(pq.size()>k)
                pq.remove();
            
        }
        
        
        return pq.stream().sorted((a,b)->Integer.compare(a[0],b[0])).map(num->num[0]).toList();
        
        
        
    }
}


/*


a=2
b=3
c=4
d=5
e=6




c
b
a
*/