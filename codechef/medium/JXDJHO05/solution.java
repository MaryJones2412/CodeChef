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