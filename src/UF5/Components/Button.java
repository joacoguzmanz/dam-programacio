package UF5.Components;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class Button extends JButton {
    public Button(String text, Color bg, Color fg) {
        super(text);
        setBounds(50, 50, 95, 30);
        setBorder(new EmptyBorder(10, 20, 10, 20));

        setMargin(new Insets(10,10,10,10));

        setOpaque(true);
        setBackground(bg);
        setForeground(fg);
    }
}
