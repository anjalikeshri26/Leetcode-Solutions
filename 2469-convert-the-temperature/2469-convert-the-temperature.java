class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0]= celsius + 273.15000;
        ans[1]= celsius * 1.80 + 32.00000;
        return ans;
    }
}