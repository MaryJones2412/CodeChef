# Composite and  Prime Queries

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers  **l**  and **r,**  find the difference between the number of composites and the number of primes between the range l and r (both inclusive).

 **Examples:** 

```
Input: l = 4, r = 6
Output: 1
Explanation: Composite no. are 4 and 6. And prime is 5. So number of composites is 2 and number if primes is 1. 
Therefore answer for this test case is 2-1 = 1.
```

```
Input: l = 1, r = 5
Output: -2
Explanation: Only one composite 4 and 3 primes 2, 3 and 5
```

```
Input: l = 4, r = 4
Output: 1
Explanation: In range [4, 4] number of primes is 0 and number of composites is 1. 
Therefore answer for this test is 1. 
```

 **Constraints:** 
1 ≤ l ≤ r ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:16:02.812Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/composite-and-prime0359/1)