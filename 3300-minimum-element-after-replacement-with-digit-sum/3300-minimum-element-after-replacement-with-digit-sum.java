class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            int s=0;
            while(i!=0)
            {
                s+=i%10;
                i/=10;
            }
            if(min>s)
            {
                min=s;
            }
        }
        return min;
    }
}