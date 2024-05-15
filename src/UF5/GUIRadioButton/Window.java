package UF5.GUIRadioButton;

import UF5.Components.Button;

import javax.swing.*;

public class Window extends JFrame {
    public Window(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(450, 450);
        setLocationRelativeTo(null);

        JPanel radioPanel = new JPanel();

        JLabel label = new JLabel("Select an option:");
        radioPanel.add(label);

        JRadioButton radio1 = new JRadioButton("Option 1");
        JRadioButton radio2 = new JRadioButton("Option 2");
        JRadioButton radio3 = new JRadioButton("Option 3");

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        radioPanel.add(radio1);
        radioPanel.add(radio2);
        radioPanel.add(radio3);

        // Add a button that prints the selected option
        Button button = new Button("Print selected option");
        button.addActionListener(e -> {
            if (radio1.isSelected()) {
                System.out.println("Option 1 selected");
            } else if (radio2.isSelected()) {
                System.out.println("Option 2 selected");
            } else if (radio3.isSelected()) {
                System.out.println("Option 3 selected");
            } else {
                System.out.println("No option selected");
            }
        });
        radioPanel.add(button);

        add(radioPanel);


        // getContentPane().add(radioPanel);
    }
}