class Solution {
    public int lengthOfLastWord(String s) {
        String[] splittedString=s.split(" ");
      
            return splittedString[splittedString.length-1].length();
    }
}