# DPNMAO02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Anagram Check

You are given two strings, $S$ and $T$. Your task is to determine if it's possible to rearrange the characters of $S$ to form the string $T$. In other words, you need to check if $T$ is an anagram of $S$.

 **NOTE:**  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Input Format
- The first line of input contains the string $S$.
- The second line of input contains the string $T$.
### Output Format
- Print True if $T$ can be formed by rearranging the characters of $S$, otherwise print False.
### Constraints
- $1\leq |S|, |T| \leq 1000$
- The strings consist of lowercase English letters only.
### Sample 1:
Input
Output

```
listen
silent
```

```
true
```

### Sample 2:
Input
Output

```
hello
world
```

```
false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T14:59:09.930Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(isAnagram(s,t))
		 System.out.println("True");
		else
		 System.out.println("False");

	}
public static boolean isAnagram(String s,String t)
	{
	    char[] a1=s.toCharArray();
	    char[] a2=t.toCharArray();
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	    return Arrays.equals(a1,a2);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO02)