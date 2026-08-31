class Solution {
    int kthPrimeFactor(int n, int k) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
                n /= i;
            }
        }

        if (n > 1) {
            k--;
            if (k == 0) {
                return n;
            }
        }

        return -1;
    }
}