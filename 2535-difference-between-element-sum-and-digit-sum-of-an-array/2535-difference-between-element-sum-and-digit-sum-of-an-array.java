import java.lang.Math;
class Solution {
    public int differenceOfSum(int[] nums) {
        int s=0, sum=0;
        for(int i:nums)
        {
            sum+=i;
            while(i!=0)
            {
                s+=i%10;
                i/=10;
            }
        }
        return Math.abs(sum-s);
    }
}