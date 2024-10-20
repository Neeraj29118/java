import java.util.Scanner;

public class BankDenomination {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount (up to 5 digits): ");
        int amount = scanner.nextInt();

        // Check for validity of amount (should be up to 5 digits)
        if (amount < 1 || amount > 99999) {
            System.out.println("OUTPUT: INVALID AMOUNT");
            return;
        }

        // Convert the amount to words
        System.out.print("OUTPUT: ");
        String amountStr = String.valueOf(amount);
        for (char digit : amountStr.toCharArray()) {
            switch (digit) {
                case '0': System.out.print("ZERO "); break;
                case '1': System.out.print("ONE "); break;
                case '2': System.out.print("TWO "); break;
                case '3': System.out.print("THREE "); break;
                case '4': System.out.print("FOUR "); break;
                case '5': System.out.print("FIVE "); break;
                case '6': System.out.print("SIX "); break;
                case '7': System.out.print("SEVEN "); break;
                case '8': System.out.print("EIGHT "); break;
                case '9': System.out.print("NINE "); break;
            }
        }
        System.out.println();
        
        // Array of available denominations
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        
        System.out.println("DENOMINATION:");
        
        // Calculate the denomination breakdown
        int totalNotes = 0;
        for (int denom : denominations) {
            if (amount >= denom) {
                int count = amount / denom;
                amount %= denom;
                totalNotes += count;
                System.out.println(denom + " X " + count + " =" + (denom * count));
            }
        }
        
        System.out.println("Total number of notes: " + totalNotes);
    }
}
