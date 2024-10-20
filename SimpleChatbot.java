import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatbot {
    private static Map<String, String> knowledgeBase = new HashMap<>();

    static {
        knowledgeBase.put("hello", "Hello! How can I assist you today?");
        knowledgeBase.put("what is the weather like?", "Unfortunately, I don't have access to weather information.");
        knowledgeBase.put("tell me a joke", "Why did the tomato turn red? Because it saw the salad dressing!");
        knowledgeBase.put("goodbye", "Goodbye! Have a great day!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple Chatbot! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = knowledgeBase.get(userInput);
            if (response != null) {
                System.out.println("Chatbot: " + response);
            } else {
                System.out.println("Chatbot: I'm sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}
