# EFMGDV14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:28:10.725Z  

```java
import java.util.ArrayList;

class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class School {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Creating Student objects
        Student student1 = new Student("Alice", 10);
        Student student2 = new Student("Bob", 11);
        Student student3 = new Student("Charlie", 9);

        // Adding the students to the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Iterating through the ArrayList and printing each student's name
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV14)