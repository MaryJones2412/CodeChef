# NQCYDV46

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Incorrect Logical Operators

Imagine you have a program that assigns a grade based on a score, but certain bug patterns can cause incorrect results. In this task, you will analyze the code and fix all the logical errors, run-time errors and syntax errors.

 **Steps to Complete** 

- Take User Input Prompt the user to enter a score. Watch for run-time errors—if the user enters a non-numeric value, int() conversion will fail.
- Apply Grading Logic Use if-elif-else statements to compare the score and determine the grade. If the score is between 90 and 100, assign "Grade A". If the score is between 80 and 89, assign "Grade B". If the score is between 70 and 79, assign "Grade C". Otherwise, assign "Grade D or F". Bug Pattern: Incorrect comparison operators or boundaries may lead to misclassification of grades.
- Print the Score with Proper Validation in format:
### Sample 1:
Input
Output

```
75
```

```
Grade: C
The score is: 75
```

### Sample 2:
Input
Output

```
80
```

```
Grade B
The score is: 80
```

### Sample 3:
Input
Output

```
70
```

```
Grade: C
The score is: 70
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:09:59.410Z  

```java
import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) {
        // Initialize variables
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // Check conditions and print grades
        // Potential Logical Error: Ensure the correct comparison operators are used
        if (score > 90 && score <= 100) {
            System.out.println("Grade: A");
        }
        else if (score > 80 && score < 90) {
            System.out.println("Grade: B");
        }
        else if (score > 70 && score < 80) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D or F");
        }

        // Printing the score
        System.out.println("The score is: " + score);

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV46)