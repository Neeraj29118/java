import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ColorfulGeoPoliticalChatbot {

    // Data for Prime Ministers and Presidents
    private static final Map<String, String> leaders = new HashMap<>();
    static {
        leaders.put("USA", "President Joe Biden");
        leaders.put("India", "Prime Minister Narendra Modi");
        leaders.put("UK", "Prime Minister Rishi Sunak");
        leaders.put("France", "President Emmanuel Macron");
        leaders.put("Germany", "Chancellor Olaf Scholz");
        // Add more leaders as needed
    }

    // Data for Indian states and capitals
    private static final Map<String, String> indianStates = new HashMap<>();
    static {
        indianStates.put("Andhra Pradesh", "Amaravati");
        indianStates.put("Arunachal Pradesh", "Itanagar");
        indianStates.put("Assam", "Dispur");
        indianStates.put("Bihar", "Patna");
        indianStates.put("Chhattisgarh", "Raipur");
        indianStates.put("Goa", "Panaji");
        indianStates.put("Gujarat", "Gandhinagar");
        indianStates.put("Haryana", "Chandigarh");
        indianStates.put("Himachal Pradesh", "Shimla");
        indianStates.put("Jharkhand", "Ranchi");
        indianStates.put("Karnataka", "Bengaluru");
        indianStates.put("Kerala", "Thiruvananthapuram");
        indianStates.put("Madhya Pradesh", "Bhopal");
        indianStates.put("Maharashtra", "Mumbai");
        indianStates.put("Manipur", "Imphal");
        indianStates.put("Meghalaya", "Shillong");
        indianStates.put("Mizoram", "Aizawl");
        indianStates.put("Nagaland", "Kohima");
        indianStates.put("Odisha", "Bhubaneswar");
        indianStates.put("Punjab", "Chandigarh");
        indianStates.put("Rajasthan", "Jaipur");
        indianStates.put("Sikkim", "Gangtok");
        indianStates.put("Tamil Nadu", "Chennai");
        indianStates.put("Telangana", "Hyderabad");
        indianStates.put("Tripura", "Agartala");
        indianStates.put("Uttar Pradesh", "Lucknow");
        indianStates.put("Uttarakhand", "Dehradun");
        indianStates.put("West Bengal", "Kolkata");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Colorful Geo-Political Chatbot");
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Using JEditorPane to support HTML content
            JEditorPane textArea = new JEditorPane("text/html", "");
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

            sendButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String userInput = textField.getText().toLowerCase();
                    String userOutput = "You: " + userInput;
                    String botResponse = getResponse(userInput);

                    String htmlOutput = "<p style='color: lightblue;'>" + userOutput + "</p>" +
                                        "<p style='color: lightgreen;'>" + botResponse + "</p>";
                    textArea.setText(textArea.getText() + htmlOutput);
                    textField.setText("");
                    textArea.setCaretPosition(textArea.getDocument().getLength()); // Scroll to the end
                }
            });

            frame.setVisible(true);
        });
    }

    private static String getResponse(String userInput) {
        if (userInput.contains("president") || userInput.contains("prime minister")) {
            return getLeadersInfo(userInput);
        } else if (userInput.contains("state") || userInput.contains("capital") || userInput.contains("india")) {
            return getIndianStatesInfo(userInput);
        } else {
            return "I didn't understand that. Please ask about world leaders or Indian states and capitals.";
        }
    }

    private static String getLeadersInfo(String query) {
        for (Map.Entry<String, String> entry : leaders.entrySet()) {
            if (query.contains(entry.getKey().toLowerCase())) {
                return "The leader of " + entry.getKey() + " is " + entry.getValue() + ".";
            }
        }
        return "Sorry, I don't have information on that country.";
    }

    private static String getIndianStatesInfo(String query) {
        for (Map.Entry<String, String> entry : indianStates.entrySet()) {
            if (query.contains(entry.getKey().toLowerCase()) || query.contains("capital")) {
                return "The capital of " + entry.getKey() + " is " + entry.getValue() + ".";
            }
        }
        return "Sorry, I don't have information on that state.";
    }
}
