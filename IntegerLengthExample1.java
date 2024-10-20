public class IntegerLengthExample1 {
    public int countDigits(int n) {
        String str = Integer.toString(n);
        return str.length();
    }

    public static void main(String[] args) {
        int number = 987654; 
        IntegerLengthExample1 obj = new IntegerLengthExample1();
        int length = obj.countDigits(number);
        System.out.println("Length of " + number + " is " + length);
    }
}
