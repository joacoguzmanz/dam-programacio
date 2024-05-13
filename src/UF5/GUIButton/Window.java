package UF5.GUIButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import UF5.Components.Button;

import java.awt.Color;


public class Window extends JFrame {
    public Window() {
        JPanel panel = new JPanel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Button");

        setSize(600, 600);
        setLocationRelativeTo(null);

        Button button = new Button("Click me!", new Color(26, 26, 26), Color.WHITE);
        panel.add(button);

        getContentPane().add(panel);
    }
}
