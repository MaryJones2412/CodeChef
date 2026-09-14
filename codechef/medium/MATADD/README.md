# MATADD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Two Matrices

Given two matrices of same size  **M x N**, add them and print the resultant matrix.

For eg., here we can see, the sum of matrices `A` and `B` is the matrix `A+B` at the rightmost side.

Let's say we have two matrices A and B of the same dimensions (**M x N**). The sum of these two matrices, denoted as C = A + B, is another matrix of the same dimensions where each element C[i][j] is the sum of the corresponding elements A[i][j] and B[i][j].

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the number of rows and columns of the two input matrices.
- Next $N$ lines contains $M$ space separated integers, the elements of first matrix.
- Similarly, next $N$ lines contains $M$ space separated integers, the elements of second matrix.
### Output Format

Output $N$ lines contains $M$ space separated integers, the elements of resultant matrix.

### Constraints
- $1 \leq N, M \leq 1000$
- The elements of both the matrices are non-negative and won't exceed $100000$.
### Sample 1:
Input
Output

```
2 3
2 3 4
4 5 6
1 7 4 
6 4 9
```

```
3 10 8
10 9 15
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T04:39:18.954Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATADD)