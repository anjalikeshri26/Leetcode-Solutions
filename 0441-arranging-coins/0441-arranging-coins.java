class Solution {
    public int arrangeCoins(int n) {
        int c=0, i=1;
        if(n==1)    return 1;
        if(n==0)    return 0;
        while((n-i)>=0)
        {
            n=n-i;
            i++;
            c++;
        }
        return c;
    }
}