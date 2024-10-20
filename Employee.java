class Employee {
    int id;
    String name;
    String designation;
    double salary;

    // Constructor with 4 arguments
    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Constructor with 3 arguments, default salary set to 50000
    Employee(int id, String name, String designation) {
        this(id, name, designation, 50000);
    }

    // Method to print employee details
    void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Example usage
        Employee emp1 = new Employee(1, "Ashutosh", "Developer", 70000);
        emp1.printDetails();

        Employee emp2 = new Employee(2, "Neeraj", "Tester");
        emp2.printDetails();
    }
}
