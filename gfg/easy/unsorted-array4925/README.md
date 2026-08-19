# Left Smaller Right Greater

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array `arr[]`, find the first element such that every element to its left is less than or equal to it, and every element to its right is greater than or equal to it.

 **Note:**  If no such element exists, return `-1`.

 **Examples :** 

```
Input: arr = [4, 2, 5, 7]
Output: 5
Explanation: All elements to the left of 5 are less than or equal to 5, and all elements to the right are greater than or equal to 5.
```

```
Input: arr = [11, 9, 12]
Output: -1
Explanation: No element in the array satisfies the required condition.
```

 **Constraints:** 
3 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:15:07.557Z  

```java

class Solution {
    public int findElement(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];

        leftMax[0] = arr[0];

        for(int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);

        int rightMin = arr[n - 1];

        for(int i = n - 2; i >= 1; i--) {
            if(arr[i] >= leftMax[i - 1] && arr[i] <= rightMin)
                return arr[i];

            rightMin = Math.min(rightMin, arr[i]);
        }

        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/unsorted-array4925/1)