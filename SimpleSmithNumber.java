import java.util.Scanner;

public class SimpleSmithNumber {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to calculate the sum of the digits of all prime factors of a number
    public static int sumOfPrimeFactorsDigits(int num) {
        int sum = 0;
        int original = num;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && !isPrime(original)) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        return sum;
    }

    // Function to check if a number is a Smith number
    public static boolean isSmith(int num) {
        if (isPrime(num)) {
            return false; // Smith numbers must be composite
        }
        int sumDigits = sumOfDigits(num);
        int sumPrimeFactorDigits = sumOfPrimeFactorsDigits(num);
        return sumDigits == sumPrimeFactorDigits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSmith(number)) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }

        scanner.close();
    }
}
