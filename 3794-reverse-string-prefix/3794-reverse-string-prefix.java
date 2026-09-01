class Solution {
    public String reversePrefix(String s, int k) {
        String a = s.substring(0,k);
        String ans="";
        for(int i=k-1; i>=0; i--) {
            ans+=a.charAt(i);
        }
        if(k<s.length())  ans+=s.substring(k);
        return ans;
    }
}