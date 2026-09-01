class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)  return 0;
        int c=1, i;
        for(i=0; i<nums.length-1; i++) {
            if(nums[i]==nums[i+1])  continue;
            c++;
            nums[c-1]=nums[i+1];    
        }
        return c;
    }
}