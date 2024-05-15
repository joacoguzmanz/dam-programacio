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

        Button button = new Button("Click me!");
        add(button);
    }
}
