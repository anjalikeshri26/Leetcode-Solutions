class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        int i=1;
        while(i<=l) {
            if(digits[l-i]!=9) {
                digits[l-i]+=1;
                return digits;
            }
            else {
                digits[l-i]=0;
                i++;
            }
        }
        int[] ans = new int[l+1];
        ans[0]=1;
        for(int j=0; j<l; j++) {
            ans[j+1]=digits[j];
        }
        return ans;
    }
}