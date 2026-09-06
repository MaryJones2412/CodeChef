# QUEUE06 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Queue - To do list

You are building a simple  **to-do list manager**  using a circular queue implemented with an array.

Each task is represented by an integer. Tasks are added one by one in the order they are received.

A task should be added to the queue only if it is not already present. If the same task appears again, it must be ignored.

After processing all tasks, display the final to-do list in the same order in which the unique tasks were first added.

The queue implementation using an array is already provided. Complete the required methods to make the to-do list work correctly.

### Sample 1:
Input
Output

```
1
2
4
5
1
2
3
9
4
9
```

```
1
2
4
5
3
9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:46:16.347Z  

```java
import java.util.Scanner;

class CircularQueueExample {
    static final int maxSize = 101;
    static int[] a = new int[maxSize];
    static int front = 0; // Index of the front element
    static int rear = -1; // Index of the rear element
    static int currentSize = 0;

    static boolean isEmpty() {
        return currentSize == 0;
    }

    static boolean isFull() {
        return currentSize == maxSize;
    }

    static int size() {
        return currentSize;
    }

    static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize;
        a[rear] = item;
        currentSize++;
    }

    static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedItem = a[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedItem;
    }

    static boolean contains(int task) {
        int idx = front;
        for (int i = 0; i < currentSize; i++) {
            if (a[idx] == task) return true;
            idx = (idx + 1) % maxSize;
        }
        return false;
    }

    static void addTask(int task) {
        if (!contains(task)) {
            enqueue(task);
        }
    }

    static void displayToDoList() {
        int count = currentSize;
        for (int i = 0; i < count; i++) {
            int task = dequeue(); // remove and print from queue
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10;
        

        for (int i = 0; i < n; i++) {
            int task = scanner.nextInt();
            if (task == -1) break;
            addTask(task);
        }

        displayToDoList();
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE06)