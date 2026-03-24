class Solution {
    public int findComplement(int num) {
//Method 1:
        if (num == 0)
            return 1;
        int mask = (1 << Integer.toBinaryString(num).length()) - 1;
        return num ^ mask;

//Method 2:
        // int ans = 0;
        // int i = 0;
        // while (num != 0) {
        //     if ((num & 1) == 0) {
        //         ans += (1 << i);
        //     }
        //     i++;
        //     num >>= 1;
        // }
        // return ans;
    }
}