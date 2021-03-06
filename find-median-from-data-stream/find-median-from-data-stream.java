class MedianFinder {
    
    PriorityQueue<Integer> min=new PriorityQueue(Collections.reverseOrder());
    PriorityQueue<Integer> max=new PriorityQueue();
    boolean isEven=true;

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        
        if(isEven){
                max.add(num);
                min.add(max.remove());
            
            
        }
        else{
             min.add(num);
            max.add(min.remove());
           
            
        }
        isEven=!isEven;
        
    }
    
    public double findMedian() {
        if(isEven)
        return (double)((max.peek())+(min.peek()))/2;
        else
           return  min.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */