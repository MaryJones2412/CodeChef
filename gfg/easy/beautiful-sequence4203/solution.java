class Solution {
    public int findSequence(int n) {
        if (n == 1) {
            return 1;
        }

        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                count++;
                n /= i;
            }
        }

        if (n > 1) {
            count++;
        }

        return count + 1;
    }
}