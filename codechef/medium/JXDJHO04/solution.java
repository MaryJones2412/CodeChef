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