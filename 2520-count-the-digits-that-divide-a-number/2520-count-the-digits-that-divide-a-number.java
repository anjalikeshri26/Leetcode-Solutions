class Solution {
    public int countDigits(int num) {
        int c=0, n1=num;
        while(num!=0)
        {
            int d=num%10;
            if(n1%d==0)
            {
                c++;
            }
            num/=10;
        }
        return c;
    }
}