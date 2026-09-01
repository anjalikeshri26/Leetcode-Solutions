class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int c=0, d=0;
        for(int i=0; i<2*n; i++)
        {
            if(i%2==0)
            {
                ans[i]=nums[c];
                c++;
            }
            else
            {
                ans[i]=nums[d+n];
                d++;
            }
        }
        return ans;
    }
}