class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // int drank = numBottles;
        // int result = numBottles;
        // while (drank >= numExchange) {
        //     int totalExchange = drank / numExchange;
        //     result += totalExchange;
        //     drank = (drank % numExchange) + totalExchange;
        // }
        // return result;

        int total = numBottles;
        while (numBottles >= numExchange) {
            int newB = numBottles / numExchange;
            int remB = numBottles % numExchange;
            total += newB;
            numBottles = remB + newB;
        }
        return total;

        // return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}