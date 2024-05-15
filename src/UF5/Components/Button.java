package UF5.Components;

import javax.swing.JButton;

public class Button extends JButton {
    public Button(String text) {
        setText(text);
        setFocusable(false);

        // addActionListener(e -> System.out.println("Hola"));
        // setForeground(new Color(255, 255, 0));
        // setOpaque(true);
        // setBackground(new Color(26, 26, 26));
    }
}
