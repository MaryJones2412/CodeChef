# BXCERA13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Saving a To-Do list
- In this worked example, we demonstrate how to build a simple To-Do List application that can store tasks and save them to a file using Java's File I/O capabilities.
- The ToDoList class maintains a list of tasks using an ArrayList<String>. Users can add tasks to this list through the addTask() method and then persist all tasks to a file named tasks.txt by calling the saveTasks() method.
- This example focuses on writing object data to a plain text file, helping you understand basic data persistence in Java through manual file handling.

 **Function Breakdown** 

- addTask(String task): Adds a task to the internal list.
- saveTasks(): Writes all tasks from the list to a file, one per line, using FileWriter.
- ToDoList() constructor: Initializes the list of tasks.

In the `main()` method:

- A ToDoList object is created.
- Two tasks are added: "Buy groceries" and "Walk the dog".
- The saveTasks() method is called to write these tasks to the file.

 **Note:**  While writing data to the file, we use `System.lineSeparator()` instead of "`\n`" to ensure each task appears on a new line, regardless of the operating system. This ensures platform-independent and consistent formatting.

 **Don't forget to check the contents of `tasks.txt` after execution to see your saved tasks!**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T14:20:03.312Z  

```cpp
        myList.saveTasks();
    }
}
        // Save tasks in the file

        myList.addTask("Walk the dog");
        myList.addTask("Buy groceries");
        ToDoList myList = new ToDoList();
        // Create a ToDoList object and add some tasks

class Codechef {
    public static void main(String[] args) {
}
    }
        }
            System.out.println("An error occurred while saving tasks.");
        } catch (IOException e) {
            System.out.println("Tasks saved to tasks.txt");
            writer.close();
            }
                writer.write(task + System.lineSeparator());
            for (String task : tasks) {
            FileWriter writer = new FileWriter(file);
            File file = new File("tasks.txt");
        try {
    public void saveTasks() {
    // Method to save tasks to a file
    }
        tasks.add(task);
    public void addTask(String task) {
    // Method to add a task to the list
    }
        tasks = new ArrayList<>();
    public ToDoList() {
    private ArrayList<String> tasks;
class ToDoList {

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
```

---

[View on CodeChef](https://www.codechef.com/problems/BXCERA13)