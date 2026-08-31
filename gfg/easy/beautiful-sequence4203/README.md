# Longest Divisible Sequence Ending at N

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer  **n**, find the max length of a sequence with the following properties.

- Strictly increasing and every term Ai divides every subsequent term Aj, where j > i. 
- Last term is n.
- The sequence always starts with 1.

 **Examples:** 

```
Input: n = 10
Output: 3
Explanation: The longest valid sequence is [1, 5, 10], which has length 3.
```

```
Input: n = 3
Output: 2
Explanation: The longest valid sequence is [1, 3], which has length 2.
```

```
Input: n = 72
Output: 6
Explanation: The longest valid sequence is [1, 2, 4, 8, 24, 72], which has length 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T09:20:19.930Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/beautiful-sequence4203/1)