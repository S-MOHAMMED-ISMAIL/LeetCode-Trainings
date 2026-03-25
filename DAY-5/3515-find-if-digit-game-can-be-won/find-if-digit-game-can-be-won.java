class Solution {
    public boolean canAliceWin(int[] nums) {
        // int oneDigit = 0, twoDigit = 0;
        // for (int i : nums) {
        //     if (i > 9)
        //         twoDigit += i;
        //     else
        //         oneDigit += i;
        // }
        // return oneDigit != twoDigit;

        int sum = 0;
        for (int n : nums) {
            if (n > 9)
                sum -= n;
            else
                sum += n;
        }
        return sum != 0;
    }
}