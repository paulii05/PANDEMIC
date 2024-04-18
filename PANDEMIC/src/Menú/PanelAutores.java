package Menú;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
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

public class PanelAutores extends JPanel implements ActionListener {
    JLabel titulo;
    JButton volver;
    JLabel texto1, texto2, texto3, texto4, contacto;
    ImageIcon imagenFondo;

    PanelAutores() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        titulo = new JLabel("PANDEMIC");
        titulo.setFont(new Font("Courier New", Font.BOLD, 150));
        titulo.setForeground(Color.WHITE);
        titulo.setAlignmentX(CENTER_ALIGNMENT);

        imagenFondo = new ImageIcon("src/Imagenes/i.jpg");

        volver = new JButton("Volver");
        volver.addActionListener(this);
        volver.setAlignmentX(CENTER_ALIGNMENT);

        contacto = new JLabel("------------- CONTACT US -------------");
        contacto.setFont(new Font("Courier New", Font.BOLD, 25));
        contacto.setForeground(Color.WHITE);
        contacto.setAlignmentX(CENTER_ALIGNMENT);

        texto1 = new JLabel("Paula Alvarado Gisbert");
        texto1.setFont(new Font("Courier New", Font.BOLD, 25));
        texto1.setForeground(Color.WHITE);
        texto1.setAlignmentX(CENTER_ALIGNMENT);

        texto2 = new JLabel("paula701ag@alumnes.ilerna.com");
        texto2.setFont(new Font("Courier New", Font.BOLD, 25));
        texto2.setForeground(Color.WHITE);
        texto2.setAlignmentX(CENTER_ALIGNMENT);

        texto3 = new JLabel("Ayrton Rene Oviedo Quesada");
        texto3.setFont(new Font("Courier New", Font.BOLD, 25));
        texto3.setForeground(Color.WHITE);
        texto3.setAlignmentX(CENTER_ALIGNMENT);

        texto4 = new JLabel("aroq20020405@alumnes.ilerna.com");
        texto4.setFont(new Font("Courier New", Font.BOLD, 25));
        texto4.setForeground(Color.WHITE);
        texto4.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(titulo);
        add(Box.createVerticalStrut(50));
        add(contacto);
        add(Box.createVerticalStrut(25));
        add(texto1);
        add(texto2);
        add(Box.createVerticalStrut(25));
        add(texto3);
        add(texto4);
        add(Box.createVerticalStrut(25));
        add(volver);
        add(Box.createVerticalGlue());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volver) {
            JFrame marco = (JFrame) SwingUtilities.getWindowAncestor(this);
            marco.remove(this);
            marco.add(new PanelPrincipal());
            marco.setVisible(true);
        }
    }
}