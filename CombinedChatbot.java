import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CombinedChatbot {
    // ANSI escape codes for console colors
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";

    // Map for Indian states and their capitals
    private static final Map<String, String> STATES_AND_CAPITALS = new HashMap<>();
    static {
        STATES_AND_CAPITALS.put("Andhra Pradesh", "Amaravati");
        STATES_AND_CAPITALS.put("Arunachal Pradesh", "Itanagar");
        STATES_AND_CAPITALS.put("Assam", "Dispur");
        STATES_AND_CAPITALS.put("Bihar", "Patna");
        STATES_AND_CAPITALS.put("Chhattisgarh", "Raipur");
        STATES_AND_CAPITALS.put("Goa", "Panaji");
        STATES_AND_CAPITALS.put("Gujarat", "Gandhinagar");
        STATES_AND_CAPITALS.put("Haryana", "Chandigarh");
        STATES_AND_CAPITALS.put("Himachal Pradesh", "Shimla");
        STATES_AND_CAPITALS.put("Jharkhand", "Ranchi");
        STATES_AND_CAPITALS.put("Karnataka", "Bengaluru");
        STATES_AND_CAPITALS.put("Kerala", "Thiruvananthapuram");
        STATES_AND_CAPITALS.put("Madhya Pradesh", "Bhopal");
        STATES_AND_CAPITALS.put("Maharashtra", "Mumbai");
        STATES_AND_CAPITALS.put("Manipur", "Imphal");
        STATES_AND_CAPITALS.put("Meghalaya", "Shillong");
        STATES_AND_CAPITALS.put("Mizoram", "Aizawl");
        STATES_AND_CAPITALS.put("Nagaland", "Kohima");
        STATES_AND_CAPITALS.put("Odisha", "Bhubaneswar");
        STATES_AND_CAPITALS.put("Punjab", "Chandigarh");
        STATES_AND_CAPITALS.put("Rajasthan", "Jaipur");
        STATES_AND_CAPITALS.put("Sikkim", "Gangtok");
        STATES_AND_CAPITALS.put("Tamil Nadu", "Chennai");
        STATES_AND_CAPITALS.put("Telangana", "Hyderabad");
        STATES_AND_CAPITALS.put("Tripura", "Agartala");
        STATES_AND_CAPITALS.put("Uttar Pradesh", "Lucknow");
        STATES_AND_CAPITALS.put("Uttarakhand", "Dehradun");
        STATES_AND_CAPITALS.put("West Bengal", "Kolkata");
    }

    // Map for Indian Union Territories and their capitals
    private static final Map<String, String> UNION_TERRITORIES_AND_CAPITALS = new HashMap<>();
    static {
        UNION_TERRITORIES_AND_CAPITALS.put("Andaman and Nicobar Islands", "Port Blair");
        UNION_TERRITORIES_AND_CAPITALS.put("Chandigarh", "Chandigarh");
        UNION_TERRITORIES_AND_CAPITALS.put("Dadra and Nagar Haveli and Daman and Diu", "Daman");
        UNION_TERRITORIES_AND_CAPITALS.put("Lakshadweep", "Kavaratti");
        UNION_TERRITORIES_AND_CAPITALS.put("Delhi", "New Delhi");
        UNION_TERRITORIES_AND_CAPITALS.put("Puducherry", "Puducherry");
        UNION_TERRITORIES_AND_CAPITALS.put("Ladakh", "Leh");
        UNION_TERRITORIES_AND_CAPITALS.put("Jammu and Kashmir", "Srinagar (Summer) / Jammu (Winter)");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose mode: 1. Console 2. GUI");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (choice == 1) {
            // Console Mode
            runConsoleChatbot(scanner);
        } else if (choice == 2) {
            // GUI Mode
            runGUIChatbot();
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    private static void runConsoleChatbot(Scanner scanner) {
        System.out.println(GREEN + "Welcome to the Console Chatbot!" + RESET);
        System.out.println(GREEN + "This chatbot can provide information on:" + RESET);
        System.out.println(GREEN + "1. The current Prime Minister of India" + RESET);
        System.out.println(GREEN + "2. The current President of India" + RESET);
        System.out.println(GREEN + "3. The capital of India" + RESET);
        System.out.println(GREEN + "4. The capital of any Indian state" + RESET);
        System.out.println(GREEN + "5. The capital of any Indian Union Territory" + RESET);
        System.out.println(GREEN + "6. General knowledge questions" + RESET);
        System.out.println(GREEN + "Type 'exit' to quit the chatbot." + RESET);
        System.out.println(GREEN + "How can I assist you today?" + RESET);

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println(RED + "Goodbye!" + RESET);
                break;
            }

            // Respond based on input
            if (input.equalsIgnoreCase("hello")) {
                System.out.println(GREEN + "Chatbot: Hi there!" + RESET);
            } else if (input.equalsIgnoreCase("prime minister of india")) {
                System.out.println(GREEN + "Chatbot: The current Prime Minister of India is Narendra Modi." + RESET);
            } else if (input.equalsIgnoreCase("president of india")) {
                System.out.println(GREEN + "Chatbot: The current President of India is Droupadi Murmu." + RESET);
            } else if (input.equalsIgnoreCase("capital of india")) {
                System.out.println(GREEN + "Chatbot: The capital of India is New Delhi." + RESET);
            } else if (input.toLowerCase().startsWith("capital of ")) {
                String state = input.substring("capital of ".length()).trim();
                String capital = STATES_AND_CAPITALS.get(state);
                if (capital != null) {
                    System.out.println(GREEN + "Chatbot: The capital of " + state + " is " + capital + "." + RESET);
                } else {
                    capital = UNION_TERRITORIES_AND_CAPITALS.get(state);
                    if (capital != null) {
                        System.out.println(GREEN + "Chatbot: The capital of " + state + " is " + capital + "." + RESET);
                    } else {
                        System.out.println(YELLOW + "Chatbot: I don't have information about that state or Union Territory." + RESET);
                    }
                }
            } else if (input.equalsIgnoreCase("who is the president of the USA")) {
                System.out.println(GREEN + "Chatbot: The current President of the USA is Joe Biden." + RESET);
            } else if (input.equalsIgnoreCase("what is the largest ocean")) {
                System.out.println(GREEN + "Chatbot: The largest ocean in the world is the Pacific Ocean." + RESET);
            } else if (input.equalsIgnoreCase("what is the tallest mountain")) {
                System.out.println(GREEN + "Chatbot: The tallest mountain in the world is Mount Everest." + RESET);
            } else {
                System.out.println(YELLOW + "Chatbot: I don't understand that." + RESET);
            }
        }
    }

    private static void runGUIChatbot() {
        JFrame frame = new JFrame("Chatbot");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField textField = new JTextField();
        panel.add(textField, BorderLayout.CENTER);

        JButton sendButton = new JButton("Send");
        panel.add(sendButton, BorderLayout.EAST);

        frame.add(panel, BorderLayout.SOUTH);

        textArea.append("Welcome to the Chatbot!\n");
        textArea.append("This chatbot can provide information on:\n");
        textArea.append("1. The current Prime Minister of India\n");
        textArea.append("2. The current President of India\n");
        textArea.append("3. The capital of India\n");
        textArea.append("4. The capital of any Indian state\n");
        textArea.append("5. The capital of any Indian Union Territory\n");
        textArea.append("6. General knowledge questions\n");
        textArea.append("Type 'exit' to quit the chatbot.\n");
        textArea.append("How can I assist you today?\n");

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField.getText();
                textArea.append("You: " + userInput + "\n");

                // Sample response
                if (userInput.equalsIgnoreCase("hello")) {
                    textArea.append("Chatbot: Hi there!\n");
                } else if (userInput.equalsIgnoreCase("prime minister of india")) {
                    textArea.append("Chatbot: The current Prime Minister of India is Narendra Modi.\n");
                } else if (userInput.equalsIgnoreCase("president of india")) {
                    textArea.append("Chatbot: The current President of India is Droupadi Murmu.\n");
                } else if (userInput.equalsIgnoreCase("capital of india")) {
                    textArea.append("Chatbot: The capital of India is New Delhi.\n");
                } else if (userInput.toLowerCase().startsWith("capital of ")) {
                    String state = userInput.substring("capital of ".length()).trim();
                    String capital = STATES_AND_CAPITALS.get(state);
                    if (capital != null) {
                        textArea.append("Chatbot: The capital of " + state + " is " + capital + ".\n");
                    } else {
                        capital = UNION_TERRITORIES_AND_CAPITALS.get(state);
                        if (capital != null) {
                            textArea.append("Chatbot: The capital of " + state + " is " + capital + ".\n");
                        } else {
                            textArea.append("Chatbot: I don't have information about that state or Union Territory.\n");
                        }
                    }
                } else if (userInput.equalsIgnoreCase("who is the president of the USA")) {
                    textArea.append("Chatbot: The current President of the USA is Joe Biden.\n");
                } else if (userInput.equalsIgnoreCase("what is the largest ocean")) {
                    textArea.append("Chatbot: The largest ocean in the world is the Pacific Ocean.\n");
                } else if (userInput.equalsIgnoreCase("what is the tallest mountain")) {
                    textArea.append("Chatbot: The tallest mountain in the world is Mount Everest.\n");
                } else {
                    textArea.append("Chatbot: I don't understand that.\n");
                }

                textField.setText("");
            }
        });

        frame.setVisible(true);
    }
}
