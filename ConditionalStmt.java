import java.util.Scanner;

public class ConditionalStmt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();

        // Example of a conditional statement
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        s.close(); // Closing the Scanner to avoid resource leak
    }
}
