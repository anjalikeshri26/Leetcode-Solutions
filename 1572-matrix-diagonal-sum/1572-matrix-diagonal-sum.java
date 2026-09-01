class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0; i<mat.length; i++)
        {
            s=s+mat[i][i];
            if((i+i)!=mat.length-1)
                s+=mat[i][mat.length-1-i];
        }
        return s;
    }
}