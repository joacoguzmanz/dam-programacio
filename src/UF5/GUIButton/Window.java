package UF5.GUIButton;

import javax.swing.*;

import UF5.Components.Button;

import java.awt.*;

public class Window extends JFrame {
    public Window(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(300, 300));
//        panel.setBackground(Color.RED);
//        panel.setLayout(new FlowLayout());
//        add(panel);

        Button button = new Button("Click me!");
        add(button);
    }
}
