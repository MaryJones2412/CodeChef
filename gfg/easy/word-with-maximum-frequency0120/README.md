# Max Frequency Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string  **s**  that is made up of words separated by spaces. Your task is to find the word with the highest frequency, i.e. it appears the most times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence.

 **Examples:** 

```
Input: s = "the devil in the sky"
Output: "the 2"
Explanation: The frequency of "the" is 2, so we return "the" and its frequency "2" i.e., "the 2" 

```

```
Input: s = "this is not right"
Output: "this 1"
Explanation: Every word has the frequency of "1", so we return "this 1" as this occurs first in the sentence. 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T15:24:21.828Z  

```java
import java.util.*;

class Solution {
    public String maximumFrequency(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String answer = words[0];
        int max = 0;

        for (String word : words) {
            if (map.get(word) > max) {
                max = map.get(word);
                answer = word;
            }
        }

        return answer + " " + max;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/word-with-maximum-frequency0120/1)