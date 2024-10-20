import java.util.Scanner;

public class KboatSmithNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isSmithNumber = isSmith(number);

        if (isSmithNumber) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }
    }

    public static boolean isSmith(int number) {
        int sumOfDigits = sumOfDigits(number);
        int sumOfPrimeFactors = sumOfPrimeFactors(number);

        return sumOfDigits == sumOfPrimeFactors;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumOfPrimeFactors(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                sum += sumOfDigits(i);
                number /= i;
            }
        }
        return sum;
    }
}