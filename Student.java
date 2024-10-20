class Student {
    // Properties of the Student class
    String name;
    int rollNo;
    String course;

    // Method to set student details
    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Creating two student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Setting the details of the students
        student1.setDetails("Ashutosh", 101, "Computer Science");
        student2.setDetails("Neeraj", 102, "Computer Science");

        // Printing the details of the students
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();
    }
}
