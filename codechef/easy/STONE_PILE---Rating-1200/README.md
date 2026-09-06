# STONE_PILE - Rating 1200

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Stone Pile

Aman and Akshat are trying to solve a task given to them by their teacher. They are given a pile of stones containing $N$ stones with an integer written on each of them. There are two different kinds of moves that can be performed on the pile :

- Player will remove a stone from the $top$ of the pile and put it back on the $bottom$ of the pile
- Player will remove a stone from the $top$ of the pile and $throw$ it away.

Aman in his turn will perform move $1$ once and then move $2$ once. Akshat in his turn will perform move $1$ twice and then move $2$ once.
They will stop making moves when there is only $1$ stone left in the pile.
Both of them gets turn alternatively with Aman going first. Find the person performing the last move and the number written on the last stone left in the pile.
The stones at index $i'th$ is located higher than the stones at index $j'th$, such that $(i \lt j)$

### Input Format
- The first line contains an integer $T$, representing $T$ Testcases.
- The first line of each test case contains an integer $N$, representing the size of Array $A$.
- The second line of each test case contains $N$ integer, representing array $A$
### Output Format
- For each test case, Print $2$ space-separated integer representing the person making the last move ($1$ for Aman and $0$ for Akshat) and the number written on the stone remaining.
### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100000$
- $-10^9 \le A_i \le 10^9$
- Sum of $N$ over all test cases does not exceed $10^6$
### Sample 1:
Input
Output

```
3
3
-5 0 5
4 
-1 -3 2 4
6
-100000 0 0 100000 -1000000 1000000

```

```
0 -5
1 2
1 0
```

### Explanation:

In the first test case,
Aman removes the stone $-5$ and put it at the bottom making the pile $\{0,5,-5\}$.
Aman then removes the stone $0$ and throw it away making the pile $\{5,-5\}$.
Akshat then removes $5$ from the top and put it at the bottom of the pile making the pile $\{-5,5\}$.
Akshat then removes $-5$ from the top and put it at the bottom of the pile making the pile $\{5,-5\}$.
Akshat then removes the stone $5$ and throw it away making the pile $\{-5\}$.
The last stone remaining has $-5$ written on it.

In the second test case, Aman removes the second last stone, and the last stone remaining has $2$ written on it.
In the third test case, Aman removes the second last stone, and the last stone remaining has $0$ written on it.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:49:43.336Z  

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            
            for (int i = 0; i < n; i++) {
                dq.offer(Integer.parseInt(st.nextToken()));
            }
            
            int lastPlayer = -1; // 1 for Aman, 0 for Akshat
            boolean isAmanTurn = true;
            
            while (dq.size() > 1) {
                if (isAmanTurn) {
                    // Aman performs: move 1 then move 2
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        dq.poll();
                        lastPlayer = 1;
                    }
                } else {
                    // Akshat performs: move 1, move 1, then move 2
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        int stone = dq.poll();
                        dq.offer(stone);
                    }
                    if (dq.size() > 1) {
                        dq.poll();
                        lastPlayer = 0;
                    }
                }
                isAmanTurn = !isAmanTurn;
            }
            
            int lastStone = dq.peek();
            sb.append(lastPlayer).append(" ").append(lastStone).append("\n");
        }
        System.out.print(sb.toString());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STONE_PILE)