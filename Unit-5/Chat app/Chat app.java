import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatApp extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    public ChatApp() {
        setTitle("Simple Chat App");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Chat display area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Input field and button
        inputField = new JTextField();
        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(panel, BorderLayout.SOUTH);

        // Button click event
        sendButton.addActionListener(e -> sendMessage());

        // Press Enter to send
        inputField.addActionListener(e -> sendMessage());

        setVisible(true);
    }

    private void sendMessage() {
        String message = inputField.getText().trim();

        if (!message.isEmpty()) {
            // User message
            chatArea.append("You: " + message + "\n");

            // Simple auto-reply (simulation)
            chatArea.append("Friend: " + getReply(message) + "\n");

            inputField.setText("");
        }
    }

    // Simple bot reply logic
    private String getReply(String msg) {
        msg = msg.toLowerCase();

        if (msg.contains("hi") || msg.contains("hello")) {
            return "Hello! How are you?";
        } else if (msg.contains("name")) {
            return "I am a Chat friend";
        } else if (msg.contains("time")) {
            return java.time.LocalTime.now().toString();
        } else if (msg.contains("bye")) {
            return "Goodbye!";
        } else {
            return "I didn't understand that.";
        }
    }

    public static void main(String[] args) {
        new ChatApp();
    }
}