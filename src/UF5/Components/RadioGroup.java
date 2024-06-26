package UF5.Components;

import javax.swing.*;
import java.awt.*;

public class RadioGroup extends JPanel {
    public RadioGroup() {
        // setLayout(new GridLayout(3, 1));

        JRadioButton radio1 = new JRadioButton("Radio 1");
        JRadioButton radio2 = new JRadioButton("Radio 2");
        JRadioButton radio3 = new JRadioButton("Radio 3");

        radio1.setBounds(50, 100, 100, 50);
        radio2.setBounds(50, 150, 100, 50);
        radio3.setBounds(50, 200, 100, 50);

        add(radio1);
        add(radio2);
        add(radio3);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
    }
}
