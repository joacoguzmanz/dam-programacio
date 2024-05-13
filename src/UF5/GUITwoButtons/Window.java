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

        Button button = new Button("Click me!", new Color(26, 26, 26), Color.WHITE);
        panel.add(button);

        Button secondButton = new Button("Click me too!", new Color(229, 28, 0), Color.WHITE);
        panel.add(secondButton);

        getContentPane().add(panel);
    }
}
