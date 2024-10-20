public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5; // Change this number to print the multiplication table for a different number
        int i = 1;

        while (i <= 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }
    }
}
