class Solution {
    public String reverseWords(String s) {
        String[] inputArray=s.trim().split(" +");
        Collections.reverse(Arrays.asList(inputArray));
        return String.join(" ",inputArray);
        
    }
}