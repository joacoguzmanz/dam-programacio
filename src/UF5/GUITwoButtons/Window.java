package UF5.GUITwoButtons;

import javax.swing.JFrame;
import javax.swing.JPanel;
import UF5.Components.Button;

import java.awt.Color;

public class Window extends JFrame {
    public Window() {
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Two Buttons");
        setSize(600, 600);
        setLocationRelativeTo(null);

        Button button = new Button("Click me!");
        panel.add(button);

        Button secondButton = new Button("Click me too!");
        panel.add(secondButton);

        getContentPane().add(panel);
    }
}
