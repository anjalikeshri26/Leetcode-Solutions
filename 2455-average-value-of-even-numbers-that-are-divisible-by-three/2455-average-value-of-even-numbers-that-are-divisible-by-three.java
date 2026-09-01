class Solution {
    public int averageValue(int[] nums) {
        int s=0, c=0;
        for(int i:nums){
            if(i%6==0)
            {
                s+=i;
                c++;
            }
        }
        if(c==0)    return 0;
        return s/c;
    }
}