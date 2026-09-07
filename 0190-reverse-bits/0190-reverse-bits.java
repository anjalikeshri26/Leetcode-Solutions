class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        String a="";
        for(int i=s.length()-1; i>=0; i--){
            a+=s.charAt(i);
        }
        while(a.length()<32)    a+='0';
        return Integer.parseInt(a,2);
    }
}