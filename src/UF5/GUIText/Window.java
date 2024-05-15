package UF5.GUIText;

import UF5.Components.Button;

import javax.swing.*;

public class Window extends JFrame {
    public Window(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(450, 450);
        setLocationRelativeTo(null);

        JPanel textPanel = new JPanel();

        JLabel nameLabel = new JLabel("Enter your name:");
        JLabel emailLabel = new JLabel("Enter your email:");
        JLabel outputLabel = new JLabel("Output:");

        textPanel.add(nameLabel);
        JTextField nameField = new JTextField(20);
        textPanel.add(nameField);

        textPanel.add(emailLabel);
        JTextField emailField = new JTextField(20);
        textPanel.add(emailField);

        textPanel.add(outputLabel);
        JTextField outputField = new JTextField(20);
        outputField.setEnabled(false);
        textPanel.add(outputField);

        // Add a button that prints the entered text
        Button button = new Button("Print entered text");
        button.addActionListener(e -> {
            outputField.setText(nameField.getText() + " - " + emailField.getText());
        });
        textPanel.add(button);

        add(textPanel);
    }
}
