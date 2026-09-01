class Solution {
    public int minimumFlips(int n) {
        int c=0;
        String s = Integer.toBinaryString(n);
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) c++;
        }
        return c;
    }
}