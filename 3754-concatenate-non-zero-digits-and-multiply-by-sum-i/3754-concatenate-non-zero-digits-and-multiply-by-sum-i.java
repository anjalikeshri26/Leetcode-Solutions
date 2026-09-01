import java.util.*;
import java.lang.Math;
class Solution {
    public long sumAndMultiply(int n) {
        int d, x=0, i=0, sum=0;
        while (n!=0)
        {
            d=n%10;
            if(d!=0)
            {
                x+=d*Math.pow(10,i);
                sum+=d;
                i++;
            }
            n/=10;
        }
        return (long)x*sum;
    }
}