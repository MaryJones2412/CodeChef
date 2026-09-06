# QUEUE09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Library used for queues implementation
## Using libraries for queue implementation

Queues can be implemented in various programming languages using different libraries or data structures. I'll provide explanations for some commonly used libraries in different languages:

### Python provides a built-in queue module :

Implementation in python

```
from queue import Queue

my_queue = Queue()
my_queue.put(1)
my_queue.put(2)
item = my_queue.get()

```

## Java provides the java.util.Queue interface:

Implementation in java

```
import java.util.LinkedList;
import java.util.Queue;

Queue<Integer> myQueue = new LinkedList<>();
myQueue.add(1);
myQueue.add(2);
int item = myQueue.poll();

```

## C++ - queue header:

In C++, the queue header from the Standard Template Library (STL) provides a queue implementation. The primary class is std::queue.

Example:

```
#include <queue>

std::queue<int> myQueue;
myQueue.push(1);
myQueue.push(2);
int item = myQueue.front();
myQueue.pop();

```

 **On the right hand side, you can see some operations we are performing using library.**   **You don't have to add anything in the code, just submit the code to see the output.**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-06T09:47:20.907Z  

```java
import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> myQueue = new LinkedList<>();

        // Enqueue elements
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);

        // Displaying the front element
        System.out.println("Front element: " + myQueue.peek());

        // Displaying and removing elements
        System.out.print("Queue elements: ");
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println();

        // Checking if the queue is empty
        if (myQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/QUEUE09)