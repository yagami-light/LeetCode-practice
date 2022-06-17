class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> factList=new ArrayList();
        List<Integer> digits=new ArrayList();
    
        for(int i=1;i<=n;i++)
        {
            digits.add(i);
        }        
        for(int i=1;i<=9;i++){
            factList.add(fact(i));
        }
        
        System.out.println("facrt List "+factList);
        
        StringBuilder res=new StringBuilder();
        getPermutation( n, k,factList,digits,res);
        return res.toString();
        
        
        
    }
    
    private void getPermutation(int n,int k,List<Integer> factList,List<Integer> digits,StringBuilder str){
        
        if(n==1){
            str.append(digits.get(0));
            return;
        }
        
        int factNumber=factList.get(n-1-1);
        int index=k/factNumber;
        if(k % factNumber == 0){
            index--;
        }
        
        str.append(digits.get(index));
        digits.remove(index);
        k-=factNumber*(index);
        getPermutation(n-1,k,factList,digits,str);
        
        
        
        
        
    }
    
    
    
    private int fact(int i){
        return i==1 ? 1 : fact(i-1)*i;
    }
    
}