class Solution {
    public int[] scoreValidator(String[] events) {
        int sc=0, c=0;
        for(String s:events)
        {
            if(s.equals("WD") || s.equals("NB"))  sc++;
            else if(s.equals("W")) c++;
            else    sc+=Integer.valueOf(s);
            if(c==10)   break;
        }
        int[] ans = {sc, c};
        return ans;
    }
}