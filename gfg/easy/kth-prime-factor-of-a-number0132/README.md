# Kth Prime Factor

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two numbers  **n** and  **k**, find the kth prime factor of n. Prime factors are considered with repetition and are taken in non-decreasing order. If k is  greater than the total number of prime factors, return -1. 

 **Examples:** 

```
Input: n = 225, k = 2
Output: 3
Explaination: The prime factorization of 225 is 3 × 3 × 5 × 5. The prime factors in non-decreasing order are [3, 3, 5, 5]. The 2nd prime factor is 3.
```

```
Input: n = 81, k = 5
Output: -1
Explaination: The prime factorization of 81 is 3 × 3 × 3 × 3. The prime factors in non-decreasing order are [3, 3, 3, 3]. There is no 5th prime factor, so return -1.
```

 **Constraints:** 
1 ≤ n ≤ 104
1 ≤ k ≤ 15

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:25:10.383Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-prime-factor-of-a-number0132/1)