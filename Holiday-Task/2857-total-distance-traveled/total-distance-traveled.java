class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans = 0;
        if (additionalTank == 0)
            return ans;
        while (mainTank >= 5 && additionalTank > 0) {
            ans += 50;
            mainTank = (mainTank - 5) + 1;
            additionalTank--;
        }
        return ans += (mainTank * 10);
    }
}