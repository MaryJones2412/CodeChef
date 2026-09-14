# MATNEGCOUNT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Negative Numbers

Given a `N x M` matrix which is sorted in non-increasing order both row-wise and column-wise, count the number of negative numbers in matrix.

For eg, in the following matrix:

There are total `6` negative numbers.

 *Note:*  It's easy to solve this problem in  **O(N*M)**  time, can you do it in  **O(N + M)** ?

### Input Format
- The first line of input contains two space separated integers $N$ and $M$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the count of negative integers in the given matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The absolute value of the matrix's elements doesn't exceed $100000$.
### Sample 1:
Input
Output

```
3 4
8 7 6 -1
7 7 -1 -2
4 -5 -6 -7

```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T04:51:28.504Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATNEGCOUNT)