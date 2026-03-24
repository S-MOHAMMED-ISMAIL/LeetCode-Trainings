class Solution {
    public int reverseBits(int n) {
        //Method 1:
        //int res = 0;
        // for (int i = 0; i < 32; i++) {
        //     res <<= 1;
        //     res |= (n & 1);
        //     n >>>= 1;
        // }
        // return res;

        //Method 2:
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (n & 1);
            n >>= 1;
            if (i < 31)
                res = res << 1;
        }
        return res;

    }
}