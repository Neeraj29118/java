import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isDisarium(num)) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }
        
        scanner.close();
    }

    public static boolean isDisarium(int num) {
        int sum = 0;
        int temp = num;
        int length = Integer.toString(num).length();

        // Calculate the sum of digits powered by their respective positions
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            length--;
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == num;
    }
}
