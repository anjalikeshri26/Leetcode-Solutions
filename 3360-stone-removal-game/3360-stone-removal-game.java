class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)    return false;
        int s=10;
        boolean f=true;
        while(n>=s)
        {
            n-=s;
            s--;
            f=!f;
        }
        return !f;
    }
}