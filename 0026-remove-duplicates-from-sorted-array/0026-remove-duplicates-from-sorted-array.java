class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)  return 0;
        int c=0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==nums[i+1])  continue;
            c++;
            nums[c]=nums[i+1];    
        }
        return c+1;
    }
}