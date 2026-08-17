# EFMGDV25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:42:21.733Z  

```java
import java.util.ArrayList;

class EvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int sum = 0;
        // Iterate through the ArrayList and calculate the sum of even numbers
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("The sum of even numbers is: " + sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV25)