// LeetCode 50 - Pow(x, n)
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        if (power < 0) { x = 1 / x; power = -power; }
        double answer = 1.0;
        while (power > 0) {
            if ((power & 1) == 1) answer *= x;
            x *= x;
            power >>= 1;
        }
        return answer;
    }
}
