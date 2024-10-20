import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = num;

        // Count number of digits
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        temp = num;

        // Calculate sum of cubes of digits
        while (temp != 0) {
            last = temp % 10;
            sum = (int) (sum + Math.pow(last, digits));
            temp = temp / 10;
        }

        // Check if sum is equal to original number
        if (num == sum) {
            return true;
        } else {
            return false;
        }
    }
}