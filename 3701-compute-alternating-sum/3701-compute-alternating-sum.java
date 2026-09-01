class Solution {
    public int alternatingSum(int[] nums) {
        int s=0, c=1;
        for(int i:nums)
        {
            s+=c*i;
            c*=-1;
        }
        return s;
    }
}