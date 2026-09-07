class Solution {
    public int reverseBits(int n) {
        String df="00000000000000000000000000000000";
        String s = Integer.toBinaryString(n);
        String a="";
        for(int i=s.length()-1; i>=0; i--){
            a+=s.charAt(i);
        }
        a+=df.substring(a.length());
        return Integer.parseInt(a,2);
    }
}