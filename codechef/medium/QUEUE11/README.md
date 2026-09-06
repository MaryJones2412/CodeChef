# QUEUE11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Enqueue and Dequeue Functions
### Enqueue(int item) Function:
- Adds an element to the rear of the queue.
- If the queue is full, it prints an error message and does not enqueue the element.
- Otherwise, it circularly increments the rear index, assigns the item to the updated rear index, and increments currentSize.
### Dequeue() Function:
- Removes an element from the front of the circular queue.
- If the queue is empty, it prints an error message and returns a sentinel value (-1 in this case, which can be considered as an error value).
- Otherwise, it retrieves the item at the front index, circularly increments the front index, decrements currentSize, and returns the removed item.
### Video Explanation
### Task
- You are given implementation of queue.
- There are some dashes, Fill the dashes present in the enqueue and dequeue function.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:36:47.336Z  

```java
class CircularQueue {
    private static final int maxSize = 101;
    private int[] a = new int[maxSize];
    private int front = 0; // Index of the front element
    private int rear = -1;  // Index of the rear element
    private int currentSize;

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize; // Circular increment
        a[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return removedItem;
    }

   
```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE11)