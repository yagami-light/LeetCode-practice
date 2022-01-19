class Solution {
    
    
    class TrieNode {
        
        TrieNode[] children;
        public TrieNode(){
            children=new TrieNode[2];
        }
        
    }
    
    public int findMaximumXOR(int[] nums) {
        
        if(nums==null ||  nums.length==0){
            return 0;
        }
        
        
        TrieNode root=new TrieNode();
        for(int n:nums){
            
            TrieNode node=root;
            for(int i=31;i>=0;i--){
                // System.out.println("i "+i);
                int currBit= (n >>> i) & 1;
                if(node.children[currBit]==null){
                    node.children[currBit]=new TrieNode();
                }
                node=node.children[currBit];
                
            }
            
           
            
        }
        
        int max=Integer.MIN_VALUE;
        
        for(int num:nums){
            
            TrieNode currNode=root;
            int currSum=0;
            
            for(int i=31;i>=0;i--){
                int currBit=(num>>i) & 1;
                if(currNode.children[currBit ^ 1]!=null){
                    
                    currSum+=(1<<i);
                    currNode=currNode.children[currBit ^1];
                    
                    
                }else{
                    
                    
                    currNode=currNode.children[currBit];
                }
                
            }
            
            
            max=Math.max(max,currSum);
            
            
        }
        
        
        
        return max;
        
        
    }
}