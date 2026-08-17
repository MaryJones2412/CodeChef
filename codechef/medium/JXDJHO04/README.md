# JXDJHO04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Comparing Employee Records
- In this practice problem, you will learn how to override the equals() method to compare two objects based on their internal data rather than their memory addresses.
- You are given two classes: Employee: Represents an employee with an employeeId and a name. Codechef: Contains the main() method to test different comparisons between Employee objects.

 **Task** 
Complete the missing lines in the code to:

- Correctly implement the equals() method so it returns true if two Employee objects have the same employeeId and name.
- Ensure that comparisons between: Two employees with the same data return true. Employees with different IDs or names return false. An employee compared to null or a different object type returns false.

 **Expected Output:** 

```
emp1 equals emp2: true
emp1 equals emp3: false
emp1 equals emp4: false
emp1 equals emp5: true
emp1 equals null: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T13:52:27.183Z  

```java
class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return this.employeeId == other.employeeId && this.name.equals(other.name);
    }
}

class Codechef {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice");
        Employee emp2 = new Employee(101, "Alice");
        Employee emp3 = new Employee(102, "Bob");
        Employee emp4 = new Employee(101, "Charlie");
        Employee emp5 = emp1;

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3));
        System.out.println("emp1 equals emp4: " + emp1.equals(emp4));
        System.out.println("emp1 equals emp5: " + emp1.equals(emp5));
        System.out.println("emp1 equals null: " + emp1.equals(null));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JXDJHO04)