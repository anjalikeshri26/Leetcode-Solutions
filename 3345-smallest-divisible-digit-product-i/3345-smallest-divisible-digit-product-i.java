class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=1000; i++)
        {
            int s=i, p=1;
            while(s!=0)
            {
                p*=s%10;
                s/=10;
            }
            if(p%t==0)  return i;
        }
        return 0;
    }
}