class Solution {
   public double powRecursion(double x, int n) {
    if (n == 0) {
        return 1;
    }
    //偶数的情况
    if ((n & 1) == 0) { 
        double temp = powRecursion(x, n / 2);
        return temp * temp;
    } else { //奇数的情况
        double temp = powRecursion(x, n / 2);
        return temp * temp * x;
    }
}

public double myPow(double x, int n) {
    if (x == -1) {
        if ((n & 1) != 0) {
            return -1;
        } else {
            return 1;
        }
    }
    if (x == 1.0f)
        return 1;

    if (n == -2147483648) {
        return 0;
    }
    double mul = 1;
    if (n > 0) {
        mul = powRecursion(x, n);
    } else {
        n = -n;
        mul = powRecursion(x, n);
        mul = 1 / mul;
    }
    return mul;
}

}