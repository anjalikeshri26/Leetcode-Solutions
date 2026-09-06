class Solution {
    public boolean isPalindrome(String s) {
        String a = "";
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++) {
            char r = s.charAt(i);
            if(Character.isLetterOrDigit(r))    a+=r;
        }
        s="";
        for(int j=a.length()-1; j>=0; j--) {
            s+=a.charAt(j);
        }
        return (a.equals(s));
    }
}