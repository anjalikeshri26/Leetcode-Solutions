class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String a=s.substring(s.lastIndexOf(' ')+1, s.length());
        return a.length();
    }
}