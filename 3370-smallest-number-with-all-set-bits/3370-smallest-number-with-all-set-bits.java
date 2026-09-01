class Solution {
    public int smallestNumber(int n) {
        String s = Integer.toBinaryString(n);
        int sum=0;
        for(int i=0; i<s.length(); i++)
        {
            sum+=Math.pow(2,i);
        }
        return sum;
    }
}