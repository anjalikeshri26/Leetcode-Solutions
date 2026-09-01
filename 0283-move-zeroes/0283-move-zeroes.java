class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)   c++;
            else {
                nums[i-c]=nums[i];
            }
        }
        for(int j=1; j<=c; j++) {
            nums[nums.length-j]=0;
        }
    }
}