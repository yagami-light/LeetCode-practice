class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        for(int i=0;i<gas.length;i++){
            if(gas[i] >0 && canCompleteCircle(gas,cost,i,0,i,false))
                return i;
        }
        
        return -1;
        
    }
    
    private boolean canCompleteCircle(int[] gas,int[] cost,int index,int currGas,int baseIndex,boolean startedJorney){
        if(index==baseIndex && startedJorney)
            return true;
        
        
        currGas=currGas+gas[index];
        if(currGas>=cost[index]){
            
                return canCompleteCircle(gas,cost,(index+1)%(gas.length),currGas-cost[index],baseIndex,true);
        }
        else 
            return false;
        
        
        
    }
    
    
    
    
}