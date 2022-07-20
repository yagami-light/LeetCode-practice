class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res=new ArrayList();
        Arrays.sort(products);
        String str="";
        for(char c:searchWord.toCharArray()){
            str+=c;
            final String cmp=str;
            res.add(Arrays.stream(products).filter(elem->elem.startsWith(cmp)).limit(3).toList());
            
            
        }
        return res;
        
        
        
    }
}