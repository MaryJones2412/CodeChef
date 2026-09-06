# QUEUE05 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Queue - Print Numbers with a Given Pattern

Let us see if you have understood 'Queues' with an implementation problem.

### Task

Write a program to print numbers in a specific pattern using a queue.
The pattern starts with 1 and alternates between printing one number and enqueueing the next number. The pattern follows these rules:

- Print 1.
- Enqueue 2.
- Print 3.
- Enqueue 4.
- Print 5.
- Enqueue 6.
- Print 7.... and so on.
- Once all numbers are completed - dequeue the remaining numbers

Check the sample output below for $N = 10$.

Update the `NumberPattern` class in the IDE to solve this problem.

### Sample 1:
Input
Output

```
 
```

```
1 3 5 7 9 2 4 6 8 10

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:41:53.348Z  

```java
public class Main {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0; // Index of the front element
    private static int rear = -1;  // Index of the rear element
    private static int currentSize;
    private static boolean isEmpty() {
        return currentSize == 0;}
    private static boolean isFull() {
        return currentSize == maxSize;}
    private static int size() {
        return currentSize;}
    private static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return; }
        rear = (rear + 1) % maxSize; // Circular increment
        a[rear] = item;currentSize++;}
    private static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return removedItem; }
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            } else {
                enqueue(i);
            }
        }
        while (!isEmpty()) {
            System.out.print(dequeue() + " ");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE05)