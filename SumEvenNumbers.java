public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        }

        System.out.println("Sum of even numbers between 1 and 10 is: " + sum);
    }
}
