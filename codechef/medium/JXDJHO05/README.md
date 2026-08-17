# JXDJHO05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Comparing Point Objects
- In this practice problem, you will learn how to override the equals() method to compare two objects based on their internal state (in this case, x and y coordinates).
- You are given two classes: Point: Represents a point in a 2D space with x and y coordinates. Codechef: Contains the main() method to test equality between different Point objects.

 **Task** 
Complete the missing lines in the code to:

- Correctly implement the equals() method in the Point class to return true when both the x and y values match.
- Ensure the method handles: Null checks. Object reference checks. Type compatibility. Field comparisons.

 **Expected Output:** 

```
p1 equals p2: true
p1 equals p3: false
p1 equals p4: false
p1 equals null: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T13:54:23.924Z  

```java
class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    @Override
    public boolean equals(Object obj) {
        // Null check
        if (obj == null) {
            return false;
        }
        // Self-check
        if (this == obj) {
            return true;
        }
        // Type check
        if (!(obj instanceof Point)) {
            return false;
        }
        // Casting
        Point other = (Point) obj;

        // Attribute comparison
        return this.x == other.x && this.y == other.y;
    }
}
class Codechef {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(1, 3);
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));
        System.out.println("p1 equals p4: " + p1.equals(p4));
        System.out.println("p1 equals null: " + p1.equals(null));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JXDJHO05)