# NQCYDV44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Off-by-One Error in Loop

In this example, we demonstrate how to iterate through a string and print its elements while identifying common bug patterns such as off-by-one errors.

- When executed, the code should print all elements in the string, but we have some errors in code.
- Try to identify and solve the error.

 **Expected Output** 

```
1
2
3
4
5
The elements of the string are: 12345

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:13:18.618Z  

```java
class CodeChef {
    public static void main(String[] args) {
    // Initialize the string
    String string = "12345";
    // Potential Logical Error: Ensure the correct loop range is used
    for (int i = 0; i < string.length(); i++) {
        System.out.println(string.charAt(i));
    }
    System.out.println("The elements of the list are: " + string);  

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV44)