class Solution {
    public boolean isPowerOfFour(int n) {
        // while (n >= 1) {
        //     if (n == 1)
        //         return true;
        //     if (n % 4 != 0)
        //         return false;
        //     n /= 4;
        // }
        // return false;

        //return n > 0 && (n & (n - 1)) == 0 && (n - 1) % 3 == 0;

        //return n > 0 && (n & (n - 1)) == 0 && (n % 10 == 4 || n % 10 == 6 || n % 10 == 1);

        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }
}