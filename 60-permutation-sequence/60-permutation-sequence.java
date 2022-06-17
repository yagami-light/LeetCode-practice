class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> factList=new ArrayList();
        for(int i=1;i<=n;i++)
            factList.add(getFact(i));
                System.out.println("factg list man "+factList);

        List<Integer> digits=new ArrayList();
        for(int i=1;i<=n;i++)
            digits.add(i);
        StringBuilder result=new StringBuilder();
        
        getPermutation( n, k,factList,digits,result);
        return result.toString();
        
    }
    
    private void getPermutation(int n,int k,List<Integer> fact,List<Integer> digits,StringBuilder result){
        System.out.println("n is "+n);
        System.out.println("digit si "+digits);
        System.out.println("k is "+k);
        if(n==1){
            result.append(digits.get(0));
            return;
        }
        System.out.println("factg list"+fact);
        int factNumber=fact.get(n-1-1);
        System.out.println("factNumber is "+factNumber);
        int index= k/factNumber;
        // index=index-1;
        if(k % factNumber==0){
            index=index-1;
        }
        System.out.println("index is "+(index));
        
        result.append(digits.get(index));
        digits.remove(index);
        k-=factNumber*(index);
        getPermutation(n-1,k,fact,digits,result);
        
        
        
        
    }
    
    
    
    int getFact(int i){
        return i==1 ? 1 : i*getFact(i-1);
    }
    
}