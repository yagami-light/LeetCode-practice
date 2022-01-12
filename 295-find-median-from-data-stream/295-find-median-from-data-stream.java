class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    boolean isEven=true;
    
    public MedianFinder() {
        
        max=new PriorityQueue(Collections.reverseOrder());
        min=new PriorityQueue();
        
    }
    
    public void addNum(int num) {
        if(isEven){
            max.add(num);
            min.add(max.remove());
            isEven=!isEven;
            
        }else{
            
            min.add(num);
            max.add(min.remove());
            isEven=!isEven;

            
        }
        
        
    }
    
    public double findMedian() {
        if(!isEven)
            return min.peek();
        else
            
            return (double)(min.peek()+max.peek())/2;
        
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */