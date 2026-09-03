# STRJ5V2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Outputting Characters from a String

Listen

We use the concept of `indexing` to find the position of a character in a `string`, which means every character in a `string` corresponds to a number/position called the `index number`.

 **Note**  - `Indexing` always starts from  ***`0`** * when going left to right.

To access the value of a specific character in a `string`, we refer to the `index number`, and use the `charAt()` method.

```
String myString = "Chaf";
System.out.println(myString.charAt(2));

Output:
a

String myString = "Chaf";
System.out.println(myString.charAt(0));

Output:
C

```

### Task

Write a program which does the following:

- Create a string variable word and assign the text "Programming" to it.
- Print the characters o and r (only one) from the string word in separate lines using the syntax defined above.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T00:15:42.171Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
		String word = "Programming";
        System.out.println(word.charAt(2));
        System.out.print(word.charAt(1));
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRJ5V2)