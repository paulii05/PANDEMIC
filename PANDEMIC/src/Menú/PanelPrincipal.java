package Menú;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelPrincipal extends JPanel implements ActionListener {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JLabel titulo;
    ImageIcon imagenFondo;

    PanelPrincipal() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        titulo = new JLabel("PANDEMIC");
        titulo.setFont(new Font("Courier New", Font.BOLD, 150));
        titulo.setForeground(Color.WHITE);
        titulo.setAlignmentX(CENTER_ALIGNMENT);

        imagenFondo = new ImageIcon("src/Imagenes/a.jpg");

        b1 = new JButton("Nueva partida");
        b2 = new JButton("Cargar partida");
        b3 = new JButton("Información");
        b4 = new JButton("Resumen de puntuaciones");
        b5 = new JButton("Autores");
        b6 = new JButton("Versión");
        b7 = new JButton("Salir");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        b1.setAlignmentX(CENTER_ALIGNMENT);
        b2.setAlignmentX(CENTER_ALIGNMENT);
        b3.setAlignmentX(CENTER_ALIGNMENT);
        b4.setAlignmentX(CENTER_ALIGNMENT);
        b5.setAlignmentX(CENTER_ALIGNMENT);
        b6.setAlignmentX(CENTER_ALIGNMENT);
        b7.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(titulo);
        add(Box.createVerticalStrut(25));
        add(b1);
        add(Box.createVerticalStrut(25));
        add(b2);
        add(Box.createVerticalStrut(25));
        add(b3);
        add(Box.createVerticalStrut(25));
        add(b4);
        add(Box.createVerticalStrut(25));
        add(b5);
        add(Box.createVerticalStrut(25));
        add(b6);
        add(Box.createVerticalStrut(25));
        add(b7);
        add(Box.createVerticalGlue());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

        } else if (e.getSource() == b2) {

        } else if (e.getSource() == b3) {
            JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
            marco.remove(this);
            marco.add(new PanelInformacion());
            marco.setVisible(true);
        } else if (e.getSource() == b4) {

        } else if (e.getSource() == b5) {
            JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
            marco.remove(this);
            marco.add(new PanelAutores());
            marco.setVisible(true);
        } else if (e.getSource() == b6) {
            JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
            marco.remove(this);
            marco.add(new PanelVersion());
            marco.setVisible(true);
        } else {
            System.exit(0);
        }
    }
}