class Solution {
    public int missingNumber(int[] nums) {
        int sXOR = 0;
        for (int i = 0; i <= nums.length; i++) {
            sXOR = sXOR ^ i;
        }
        for (int i : nums)
            sXOR = sXOR ^ i;
        return sXOR;
    }
}