class Solution {
    public String reverseWords(String s) {
        String res="";
        Scanner sc=new Scanner(s);
        while(sc.hasNext()){
            res=sc.next()+" "+res;
        }
        
        return res.trim();
    }
}