class Solution {
    public boolean isPalindrome(String s) {
        String a = "", p="";
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            char r = s.charAt(i);
            if(Character.isLetterOrDigit(r))    a+=r;
            char n = s.charAt(s.length()-i-1);
            if(Character.isLetterOrDigit(n))    p+=n;
        }
        return (a.equals(p));
    }
}