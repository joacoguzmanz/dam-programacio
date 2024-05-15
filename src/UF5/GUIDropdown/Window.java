package UF5.GUIDropdown;

import UF5.Components.Button;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        JPanel outputPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        JLabel label = new JLabel("Select your role:");
        JLabel outputLabel = new JLabel("You chose:");
        inputPanel.add(label);

        String[] options = {"Front-end", "Back-end", "DevOps"};
        JComboBox<String> dropdown = new JComboBox<>(options);
        inputPanel.add(dropdown);

        outputPanel.add(outputLabel);
        JTextField outputField = new JTextField(10);
        outputField.setEnabled(false);
        outputPanel.add(outputField);

        Button button = new Button("Print selected role");
        button.addActionListener(e -> {
            outputField.setText((String) dropdown.getSelectedItem());
        });
        buttonPanel.add(button);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel);
        add(outputPanel, BorderLayout.SOUTH);
    }
}
