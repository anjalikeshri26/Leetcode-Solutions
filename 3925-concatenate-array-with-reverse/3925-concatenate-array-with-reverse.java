class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l=nums.length, i;
        int[] ans = new int[2*l];
        for(i=0; i<l; i++)
        {
            ans[i]=nums[i];
        }
        for(i=0; i<l; i++)
        {
            ans[i+l]=nums[l-i-1];
        }
        return ans;
    }
}