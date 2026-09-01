class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;
        for(String s:sentences)
        {
            int l=count(s);
            if(l>max)
            {
                max=l;
            }
        }
        return max;
    }
    public int count(String a)
    {
        int c=1;
        for(int i=0; i<a.length(); i++)
        {
            if(a.charAt(i)==' ')
            {
                c++;
            }
        }
        return c;
    }
}