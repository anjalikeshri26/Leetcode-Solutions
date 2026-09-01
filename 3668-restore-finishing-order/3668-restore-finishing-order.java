class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int c=0;
        for(int i:order)
        {
            for(int j:friends)
            {
                if(i==j)
                {
                    ans[c]=i;
                    c++;
                    break;
                }
            }
        }
        return ans;
    }
}