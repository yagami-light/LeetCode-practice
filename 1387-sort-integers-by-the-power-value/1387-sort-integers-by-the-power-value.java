class Solution {
    class Node{
        int val;
        int powerVal;
        
        Node(int val,int powerVal){
            this.val=val;
            this.powerVal=powerVal;
        }
        
        public String toString(){
            return ("val "+val +" powerVal "+powerVal);
        }
        
    }
    public int getKth(int lo, int hi, int k) {
        Map<Integer,Integer> cache=new HashMap();
        TreeSet<Node> pq=new TreeSet<>(((Node a,Node b)->(Integer.compare(a.powerVal,b.powerVal)==0 ? Integer.compare(a.val,b.val): Integer.compare(a.powerVal,b.powerVal))));
        
        for(int i=lo;i<=hi;i++){
            
            pq.add(new Node(i,getPowerValue(i,cache)));
            
        }
        // System.out.println(pq);
        // int count=0;
        // while(count<k){
        //     Node node=pq.remove();
        //     if(k-1==count)
        //         return node.val;
        //     count++;
        // }
        
        
        return pq.toArray(new Node[0])[k-1].val;
        
        // return -1;
        
    }
    
    
    private int getPowerValue(final int n,Map<Integer,Integer> cache){
        int count=0;
        int num=n;
        // // System.out.println("intput n "+n);
        // System.out.println("cache "+cache);
        if(cache.get(num)!=null)
            return cache.get(num);
        
        while(num!=1){
            if(num % 2 != 0){
                num=(3 * num)+1;
                 count++;
                int temp=getPowerValue(num,cache);
                cache.put(num,temp);
               
                
            }else{
                
                num/=2;
                count++;
                int temp=getPowerValue(num,cache);
                cache.put(num,temp);
                //count+=1+temp;
            }
            
            
            
        }
        cache.put(n,count);
        return count;
        
        
        
    }
    
}