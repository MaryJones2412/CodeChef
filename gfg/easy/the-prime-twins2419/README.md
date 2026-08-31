# The Prime Twins

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two positive integers **l**  and  **r**  (l < r), find the first pair of twin primes in the range [l, r]. Two numbers are called twin primes if both are prime and their difference is exactly 2. If no such pair exists, return {-1}.

 **Examples:** 

```
Input: l = 0, r = 5
Output: [3, 5]
Explanation: 3 and 5 are both prime numbers, their difference is 2, and they form the first twin prime pair in the range [l, r].

```

```
Input: l = 5, r = 10
Output: [5, 7]
Explanation: 5 and 7 are both prime numbers, their difference is 2, and they form the first twin prime pair in the range [l, r].

```

 **Constraints:** 
0 ≤ l < r ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:22:06.271Z  

```java
class Solution {
    public ArrayList<Integer> primeTwins(int l, int r) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = Math.max(2, l); i + 2 <= r; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                ans.add(i);
                ans.add(i + 2);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-prime-twins2419/1)