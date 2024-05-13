package UF5.GUIRadioButton;

import UF5.Components.RadioGroup;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
    public Window() {
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Radio Button");
        setSize(600, 600);
        setLocationRelativeTo(null);

        RadioGroup radioGroup = new RadioGroup();
        panel.add(radioGroup);

        getContentPane().add(panel);
    }
}