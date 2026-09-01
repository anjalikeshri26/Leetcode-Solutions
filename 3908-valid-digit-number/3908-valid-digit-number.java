class Solution {
    public boolean validDigit(int n, int x) {
        if(n==x || n==0)    return false;
        if((n/(int)Math.pow(10, (int)Math.log10(n)))==x)  return false;
        while(n>=10)
        {
            if((n%10)==x)   return true;
            n/=10;
        }
        return false;
    }
}