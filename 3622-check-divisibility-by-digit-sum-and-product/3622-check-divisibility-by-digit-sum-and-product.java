class Solution {
    public boolean checkDivisibility(int n) {
        int s=0, p=1, n1=n;
        while(n!=0){
            s+=n%10;
            p*=n%10;
            n/=10;
        }
        return (n1%(p+s)==0);
    }
}