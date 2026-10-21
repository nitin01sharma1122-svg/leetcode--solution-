
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        boolean negative = power < 0;

        if (negative) {
            power = -power;
        }

        double ans = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= x;
            }

            x *= x;
            power >>= 1;
        }

        return negative ? 1.0 / ans : ans;
    }
}
