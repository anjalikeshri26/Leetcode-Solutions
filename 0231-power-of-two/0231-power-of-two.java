import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        int i=0;
        while(n>=Math.pow(2,i))
        {
            if(n==Math.pow(2,i))
            {
                return true;
            }
            i++;
        }
        return false;
    }
}