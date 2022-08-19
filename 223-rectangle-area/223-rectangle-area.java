class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        /*
        ap3=(ax2,ay1)
        ap4=(ax1,ay2)
        
        bp3=(bx2,by1)
        bp4=(bx1,by2);
        
        int cx2=Math.min(Math.abs(ax2),Math.abs(bx2)) == Math.abs(ax2) ? ax2 : bx2;
        int cy2=Math.min(Math.abs(ay2),Math.abs(by2)) == Math.abs(ay2) ? ay2 : by2;
        
        int cx1=Math.min(Math.abs(ax1),Math.abs(bx1)) == Math.abs(ax1) ? ax1 : bx1;
        int cy1=Math.min(Math.abs(ay1),Math.abs(by1)) == Math.abs(ay1) ? ay1 : by1;
        
        
        */
        int area1=calculateArea(ax1,ay1,ax2,ay2);
        int area2=calculateArea(bx1,by1,bx2,by2);
        System.out.println("area1 :"+area1);
        System.out.println("area2 :"+area2);
        int cx2=Math.min(ax2,bx2);
        int cy2=Math.min(ay2,by2);
        
        int cx1=Math.max(ax1,bx1);
        int cy1=Math.max(ay1,by1);
        
        return isOverLap(ax1,ay1,ax2,ay2,bx1,by1,bx2,by2) ? (area1+area2 - calculateArea(cx1,cy1,cx2,cy2)) : (area1+area2);
        
        
        
    }
    //(x1 < x4) && (x3 < x2) && (y1 < y4) && (y3 < y2)

    private boolean isOverLap(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        
    return (x1 < x4) && (x3 < x2) && (y1 < y4) && (y3 < y2);
        
        
    }
    private int calculateArea(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        
        return Math.abs(x2-x1) * Math.abs(y1-y2);
        
    }
    
      private int calculateArea(int ax1, int ay1, int ax2, int ay2){
        
        return Math.abs(ax2-ax1) * Math.abs(ay1-ay2);
        
    }
    
    
}