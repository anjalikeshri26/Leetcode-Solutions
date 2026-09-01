class Solution {
    public int missingNumber(int[] nums) {
        int s=0, sum=nums.length;
        for(int i=0; i<nums.length; i++) {
            s+=nums[i];
            sum+=i;
        }
        return sum-s;
    }
}