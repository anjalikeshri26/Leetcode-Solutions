class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int n=Math.max(num1, num2);
        n=Math.max(num3, n);
        int c=0, m=0, key=0;
        while(n>0)
        {
            m=Math.min(num1%10, num2%10);
            m=Math.min(m, num3%10);
            key+=m*Math.pow(10, c);
            c++;
            num1/=10;
            num2/=10;
            num3/=10;
            n/=10;
        }
        return key;
    }
}