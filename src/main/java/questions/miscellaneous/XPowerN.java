package questions.miscellaneous;

public class XPowerN {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;
        return n % 2 == 0 ? myPow(x, n / 2) * myPow(x, n / 2) : myPow(x, n / 2) * myPow(x, n / 2) * x;
    }
}
