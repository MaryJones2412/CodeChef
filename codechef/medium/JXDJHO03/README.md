# JXDJHO03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Comparing Student Records
- This example shows how to override the equals() method to compare two objects based on their content rather than their memory reference.
- The StudentRecord class stores a student’s ID and name. In the main() method, several StudentRecord objects are created and compared using the equals() method. The comparison checks if two students are considered equal when their studentId and name match.
- The example also includes cases where: Two different objects have the same values. Objects have different values. The same object is compared with itself. An object is compared with null. An object is compared with an object of a different type.

 **When executed, the code will show:** 

```
student1.equals(student2): true
student1.equals(student3): false
student1.equals(student4): false
student1.equals(student1): true
student1.equals(student5): true
student1.equals(null): false
student1.equals(notAStudent): false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T13:51:25.413Z  

```java
class StudentRecord {
    private int studentId;
    private String name;

    public StudentRecord(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudentRecord)) {
            return false;
        }

        StudentRecord other = (StudentRecord) obj;

        return this.studentId == other.studentId && this.name.equals(other.name);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord(123, "Alice");
        StudentRecord student2 = new StudentRecord(123, "Alice");
        StudentRecord student3 = new StudentRecord(456, "Bob");
        StudentRecord student4 = new StudentRecord(123, "Charlie");
        StudentRecord student5 = student1;
        String notAStudent = "Not a student";

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.equals(student4): " + student1.equals(student4));
        System.out.println("student1.equals(student1): " + student1.equals(student1));
        System.out.println("student1.equals(student5): " + student1.equals(student5));
        System.out.println("student1.equals(null): " + student1.equals(null));
        System.out.println("student1.equals(notAStudent): " + student1.equals(notAStudent));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JXDJHO03)