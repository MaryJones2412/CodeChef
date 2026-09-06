# QUEUE08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice problem - Necklace

Your best friend has a very interesting necklace with $n$ pearls. On each of the pearls of the necklace there is an integer. However, your friend wants to modify the necklace a bit and asks you for help. She wants to move the first pearl $k$ spots to the left (and do so with all other pearls).

For example: if the necklace was originally $1, 5, 3, 4, 2$ and $k = 2$, now it becomes $3, 4, 2, 1, 5$.

Help your best friend determine how the necklace will look after the modification.

### Input Format
- First line will contain $T$, the number of test cases. Then the test cases follow.
- Each test case contains two lines of input, the first containing two integers $n, k$.
- The second line of each test case contains $n$ integers $a_1, a_2,..., a_n$ representing the integers on the pearls starting from the first one.
### Output Format

For each testcase, output in a single line $n$ integers representing the necklace after modification.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq n \leq 10^5$
- The sum of $n$ over all test cases does not exceed $3 \cdot 10^5$
- $0 \leq k \leq n$
- $-10^9 \leq a_i \leq 10^9$
### Subtasks
- 30 points : The sum of $n$ over all test cases does not exceed $5000$
- 70 points : original constraints
### Sample 1:
Input
Output

```
2
5 3
1 5 3 4 2
6 5
10 1 2 9 8 2
```

```
4 2 1 5 3
2 10 1 2 9 8
```

### Explanation:

The first test case is the example from the statement. In the second test case, when we move every element 5 to the left we get the answer.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:51:27.250Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class NecklaceRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken()); // Number of test cases 
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Queue<Integer> necklace = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            // Enqueue the elements (pearls) into the queue
            for (int i = 0; i < n; i++) {
                necklace.add(Integer.parseInt(st.nextToken()));
            }

            // Optimize k if it's greater than n
            k = k % n;

            // Rotate the queue left by k positions
            for (int i = 0; i < k; i++) {
                int removed = necklace.poll();
                necklace.add(removed);
            }

            // Append the modified necklace to StringBuilder
            while (!necklace.isEmpty()) {
                sb.append(necklace.poll()).append(" ");
            }
            sb.append("\n");
        }

        // Print all outputs at once for speed
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE08)