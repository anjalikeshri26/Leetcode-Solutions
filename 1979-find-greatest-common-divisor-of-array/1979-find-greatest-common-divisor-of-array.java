class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return gcd(max, min);
    }
    public int gcd(int x, int y)
    {
        if(x==0)    return y;
        else    return gcd(y%x,x);
    }
}