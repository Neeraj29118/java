public class SmithCheck {
    public static void main(String[] args) {
        String fullString = "John Smith";
        String searchString = "smith";

        // Convert both strings to lower case to make the search case insensitive
        if (fullString.toLowerCase().contains(searchString.toLowerCase())) {
            System.out.println("The string contains 'smith'.");
        } else {
            System.out.println("The string does not contain 'smith'.");
        }
    }
}
