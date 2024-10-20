public class Main {
    public static void main(String[] args) {
        Student raj = new Student();  // Correct object creation
        Student s1 = new Student();   // Fixed the constructor call
        System.out.println(raj.marks); // Accessing the 'marks' field, which defaults to 0
    }
}

class Student {  // Capitalized the class name
    int roll_no;
    int marks;

    Student() {   // Constructor name should match the class name
        System.out.println("Default constructor called");
    }
}
