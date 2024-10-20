public class VarArgs {
    // Method to add variable length arguments
    int add(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgs vg = new VarArgs();
        
        // Calling the add method with different sets of arguments
        int result1 = vg.add(10, 10);  // 10 + 10 = 20
        int result2 = vg.add(50, 50, 1);  // 50 + 50 + 1 = 101
        
        // Printing the results
        System.out.println(result1); // Output: 20
        System.out.println(result2); // Output: 101
    }
}
