class Solution {
    public int numberOfMatches(int n) {
        int s=0;
        while(n!=1)
        {
            if(n%2!=0)
            {
                s+=(n-1)/2;
                n=(n-1)/2+1;
            }
            else
            {
                s+=n/2;
                n/=2;
            }
        }
        return s;
    }
}