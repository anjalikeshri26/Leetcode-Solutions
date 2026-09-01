class Solution {
    public int alternateDigitSum(int n) {
        int s=0, c=1;
        if(((int)Math.log10(n)+1)%2==0) c=-1;
        while(n!=0)
        {
            s+=c*(n%10);
            c*=-1;
            n/=10;
        }
        return s;
    }
}