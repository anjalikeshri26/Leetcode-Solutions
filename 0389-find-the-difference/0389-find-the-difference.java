class Solution {
    public char findTheDifference(String s, String t) {
        String a=s.concat(t);
        int x=0;
        for(int i=0; i<a.length(); i++)
        {
            x^=(int)a.charAt(i);
        }
        return (char)x;
    }
}