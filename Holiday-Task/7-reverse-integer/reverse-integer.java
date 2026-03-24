class Solution {
    public int reverse(int x) {
        int check = 1;
        if (x < 0) {
            x *= -1;
            check = -1;
        }
        long rev = 0;
        while (x > 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        rev *= check;
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
            return 0;

        return (int) rev;
    }
}