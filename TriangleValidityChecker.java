import java.util.Scanner;

public class TriangleValidityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle of the triangle:");
        int angle1 = scanner.nextInt();

        System.out.println("Enter the second angle of the triangle:");
        int angle2 = scanner.nextInt();

        System.out.println("Enter the third angle of the triangle:");
        int angle3 = scanner.nextInt();

        // Check if the triangle is valid
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3 == 180)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        scanner.close();
    }
}
