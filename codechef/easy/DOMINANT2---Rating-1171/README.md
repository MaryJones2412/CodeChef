# DOMINANT2 - Rating 1171

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Dominant Element

You are given an array $A$ of length $N$. An element $X$ is said to be  *dominant*  if the frequency of $X$ in $A$ is strictly greater than the frequency of any other element in the $A$.

For example, if $A = [2, 1, 4, 4, 4]$ then $4$ is a dominant element since its frequency is higher than the frequency of any other element in $A$.

Find if there exists any dominant element in $A$.

### Input Format
- The first line of input contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first line of each test case contains an integer $N$ — the size of the array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ denoting the array $A$.
### Output Format

For each test case, output `YES` if there exists any dominant element in $A$. Otherwise, output `NO`.

You may print each character of `YES` and `NO` in uppercase or lowercase (for example, `yes`, `yEs`, `Yes` will be considered identical).

### Constraints
- $1 \le T \le 500$
- $1 \le N \le 1000$
- $1 \le A_i \le N$
### Sample 1:
Input
Output

```
4
5
2 2 2 2 2
4
1 2 3 4
4
3 3 2 1
6
1 1 2 2 3 4

```

```
YES
NO
YES
NO

```

### Explanation:

 **Test case $1$:**  $2$ is the dominant element.

 **Test case $2$:**  There does not exist any dominant element.

 **Test case $3$:**  $3$ is the dominant element.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T07:08:55.946Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            }
            int max_freq = 0;
            int max_freq_count = 0;

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int count = entry.getValue();
                if (count > max_freq) {
                    max_freq = count;
                    max_freq_count = 1;
                } else if (count == max_freq) {
                    max_freq_count++;
                }
            }

            System.out.println(max_freq_count == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DOMINANT2)