class Solution {
    public int maximumWealth(int[][] accounts) {
        // int rich = 0;
        // for (int i[] : accounts) {
        //     int sum = 0;
        //     for (int money : i) {
        //         sum += money;
        //     }
        //     rich = Math.max(sum, rich);
        // }
        // return rich;

        int rich = 0;
        for (int i = 0; i < accounts.length; i++) {
            int money = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                money += accounts[i][j];
            }
            rich = Math.max(money, rich);
        }
        return rich;
    }
}