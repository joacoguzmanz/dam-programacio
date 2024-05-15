package UF5.GUITwoButtons;

import javax.swing.JFrame;
import javax.swing.JPanel;
import UF5.Components.Button;

public class Window extends JFrame {
    public Window(String title) {
        JPanel panel = new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(400, 400);
        setLocationRelativeTo(null);

        Button button = new Button("Click me!");
        panel.add(button);

        Button secondButton = new Button("Click me too!");
        panel.add(secondButton);

        add(panel);
    }
}
