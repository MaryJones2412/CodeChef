# QUEUE10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### isEmpty, isFull, functions of Queue
### Implementation of Queue1

We are implementing queue using an array, We first initialize an array with a fixed size which will be the max size of our queue. we will be also using three global variable here :-

- front - for tracing the index of first element of queue.
- rear - for tracing the index of rear element of queue.
- maxSize - storing the max size of array.
#### isEmpty function
- Checks if the queue is empty.
- Returns true if the currentSize (number of elements in the queue) is 0; otherwise, returns false.
#### isFull() Function:
- Checks if the queue is full.
- Returns true if the currentSize is equal to the maximum size (maxSize); otherwise, returns false.
### size() Function:
- Returns the current number of elements in the queue (currentSize).
### Task
- Given three function for the implementation of queue
- Complete these function by filling the dash.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:38:26.649Z  

```java
public class Main {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0; // Index of the front element
    private static int rear = -1;  // Index of the rear element
    private static int currentSize;

    private static boolean isEmpty() {
        if(currentSize == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private static boolean isFull() {
        if(currentSize == maxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     private static int size() {
        return maxSize;
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE10)