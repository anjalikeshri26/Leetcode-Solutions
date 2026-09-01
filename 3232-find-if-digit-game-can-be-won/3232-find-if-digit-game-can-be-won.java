class Solution {
    public boolean canAliceWin(int[] nums) {
        int s=0, ss=0;
        for(int i:nums){
            if(i<10)    s+=i;
            else    ss+=i;
        }
        if(s==ss)   return false;
        return true;
    }
}