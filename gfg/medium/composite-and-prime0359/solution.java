class Solution {
    public int count(int l, int r) {
        boolean[] prime = new boolean[r + 1];

        for (int i = 0; i <= r; i++) {
            prime[i] = true;
        }

        prime[0] = false;
        if (r >= 1) {
            prime[1] = false;
        }

        for (int i = 2; i * i <= r; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= r; j += i) {
                    prime[j] = false;
                }
            }
        }

        int primes = 0;
        int composites = 0;

        for (int i = l; i <= r; i++) {
            if (prime[i]) {
                primes++;
            } else if (i > 1) {
                composites++;
            }
        }

        return composites - primes;
    }
}