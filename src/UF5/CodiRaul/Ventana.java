package UF5.CodiRaul;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.util.Objects;


public class Ventana extends JFrame {
    JPanel panel;
    public Ventana() {
        this.setSize(800, 800); // Tamaño
        setTitle("Primer boton"); // Titulo
        // setLocation(100,200) ; Posicion
        // setBounds(100,300,200,100); Tamaño y posicion
        // setMinimumSize(new Dimension(200, 200)); // Tamaño minimo de la ventana
        setLocationRelativeTo(null); // Lo pone en el centro la ventana

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cierra ventana y acaba el programa.
    }

    private void iniciarComponentes() {
        panel();
        boton();
    }

    private void panel() {
        panel = new JPanel(); // Crear un panel
        panel.setLayout(null); // Desactivar el diseño (layout)
        this.getContentPane().add(panel); // Agregar panel a la ventana
    }

    private void boton() {
        JButton boton2 = new JButton("Click");
        ImageIcon clickImg = new ImageIcon("CABJ70.png");

        Image img = clickImg.getImage();
        Image resizedImg = img.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        boton2.setBounds(100, 200, 250, 100);
        boton2.setIcon(resizedIcon);
        boton2.setHorizontalTextPosition(SwingConstants.CENTER);
        boton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        panel.add(boton2);
    }
}