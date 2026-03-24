class Solution {
    public int integerReplacement(int n1) {
        long n = n1;
        int steps = 0;
        while (n != 1) {
            if (n % 2 == 0)
                n /= 2;
            else if (n == 3 || n % 4 == 1)
                n--;
            else // n % 4 == 3
                n++;
            
            // else if ( n!=3 && n % 4 == 3)
            //     n++;
            // else // (n == 3 || n % 4 == 1)
            //     n--;

            steps++;
        }
        return steps;
    }
}