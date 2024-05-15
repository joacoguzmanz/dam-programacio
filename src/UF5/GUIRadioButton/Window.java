package UF5.GUIRadioButton;

import UF5.Components.RadioGroup;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Radio Button");
        setSize(600, 600);
        setLocationRelativeTo(null);

        JPanel radioPanel = new JPanel();

        JLabel label = new JLabel("Select an option:");
        radioPanel.add(label);

        RadioGroup radioGroup = new RadioGroup();
        radioPanel.add(radioGroup);

        // getContentPane().add(radioPanel);
    }
}