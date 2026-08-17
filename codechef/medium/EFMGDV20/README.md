# EFMGDV20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:34.724Z  

```java
import java.util.ArrayList;

class Student {
    private String name;
    private int grade;

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

class StudentFilter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 10));
        students.add(new Student("Bob", 8));
        students.add(new Student("Charlie", 11));
        students.add(new Student("David", 9));
        students.add(new Student("Eve", 10));

        int minGrade = 9;
        int maxGrade = 10;

        ArrayList<Student> filteredStudents = new ArrayList<>();
        
        for(Student student : students){
            if(student.getGrade()>=minGrade && student.getGrade()<=maxGrade){
                filteredStudents.add(student);
            }
        }
        
        for(Student student : filteredStudents){
            System.out.println(student.getName());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV20)