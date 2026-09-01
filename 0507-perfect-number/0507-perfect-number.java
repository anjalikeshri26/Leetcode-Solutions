class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=1, n=num;
        if(n==1)    return false;
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                s+=i+num/i;
            }
        }
        return (s==n);
    }
}