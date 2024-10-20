import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        reader.close(); // Closing the Scanner to avoid resource leak
    }
}
