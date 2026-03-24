class Solution {
    public int countOdds(int low, int high) {
//method 1
        // int ans = high - low + 1;
        // if (low % 2 != 0 && high % 2 != 0) {
        //     return ans / 2 + 1;
        // }
        // return ans / 2;

//Method 2
        //return (high + 1) / 2 - (low / 2);

//method 3
        return (high - low + 1 + (high % 2 & low % 2)) / 2;// single line Approach
    }
}