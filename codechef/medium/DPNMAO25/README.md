# DPNMAO25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Most Frequent Vowel

You are given a string $S$ of length $N$ consisting of lowercase English letters.
Your task is to find the vowel ($a$, $e$, $i$, $o$, $u$) that appears most frequently in the string.

 **Note:**  You may assume that the input string will always have a unique most frequent vowel.

### Input Format
- The first line contains a single integer $N$, representing the length of the string.
- The second line contains the string $S$.
### Output Format
- Print a single character representing the most frequent vowel.
### Constraints
- $1 \leq N \leq 10^5$
### Sample 1:
Input
Output

```
7
xayuaba
```

```
a
```

### Explanation:

The vowel $'a'$ occurs $3$ times, $'u'$ occurs $1$ time.
As $'a'$ occurs most frequently, it is our answer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:53:05.375Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a') countA++;
            else if (c == 'e') countE++;
            else if (c == 'i') countI++;
            else if (c == 'o') countO++;
            else if (c == 'u') countU++;
        }

        int maxCount = countA;
        char maxVowel = 'a';

        if (countE > maxCount) { maxCount = countE; maxVowel = 'e'; }
        if (countI > maxCount) { maxCount = countI; maxVowel = 'i'; }
        if (countO > maxCount) { maxCount = countO; maxVowel = 'o'; }
        if (countU > maxCount) { maxVowel = 'u'; }

        System.out.println(maxVowel);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO25)