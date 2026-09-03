# STRJ6V2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Changing Characters in a String

Listen

To change the value of a specific character in a `string`:

- We convert the string into a character array using the toCharArray() method.
- Refer to the index number.
- We then use single quotes to declare the new value, like so,

```
String word = "CodeShef";
char[] wordArray = word.toCharArray();
wordArray[4] = 'C';

```

### Task

Write a program which does the following:

- Initialise a string variable word and assign the value "Ocygen" to it.
- You now want to fix the typo in the given string.
- Use the syntax learnt previously to replace 'c' with 'x' in the variable word.
- Output the updated word to console.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T00:57:09.859Z  

```java
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		String word = "Ocygen";
        char[] wordArray = word.toCharArray();
        wordArray[1] = 'x';
        word = new String(wordArray);
        System.out.println(word);
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STRJ6V2)