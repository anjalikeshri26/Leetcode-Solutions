class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int c=0;
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[i]==nums[j] && i!=j)
                {
                    if(ans[0]!=nums[j])
                    {
                        ans[c]=nums[j];
                        c=1;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}