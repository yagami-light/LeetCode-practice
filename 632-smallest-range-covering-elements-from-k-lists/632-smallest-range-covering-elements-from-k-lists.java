class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a,b)->Integer.compare(a[0],b[0]));
        //num,row,col
        int lo=-1,hi=-1;
        int max=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            List<Integer> list=nums.get(i);
            int num=list.get(0);
            int[] node=new int[]{num,i,0};
            pq.add(node);
            max=Math.max(num,max);
            
            
        }
        
        while(true){
        int[] node=pq.remove();
        int min=node[0];
        int row=node[1];
        int col=node[2];
        
        if(minDiff > (max-min)){
            minDiff=max-min;
            lo=min;
            hi=max;
        }
        
        List<Integer> currList=nums.get(row);
        if(col+1<currList.size()){
            
            int[] newNode=new int[]{currList.get(col+1),row,col+1};
            max=Math.max(max,newNode[0]);
            pq.add(newNode);
            
        }else{
            break;
        }
        
            
            
        }
        
        
        return new int[]{lo,hi};
        
        
        
        
        
        
        
    }
}

/*


20(2)
24(1)
22(3)


max=5
min=0
minRage=5-0 : 5 , 0,5
----
max=9(2)
min=4(1)
minRage:9-4 : 5 , 4-9
----
max=10(1)
min=5
minRage:10-5:5, 5-10
----
max=18(3)
min=9
minRage:18-9:9, 9-18
----
max=18
min=10
minRage:18-10 : 8 , 10-18
--=-
max=18
min=12
minRage:18-12: 6 , 12-18
----
max=20
min=15
minRage:20-15:5,15-20
----
max=24
min=20
minRage:24-20 : 4, 20-24
---
max=24
min=18
minRage

---














*/