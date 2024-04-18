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

public class PanelVersion extends JPanel implements ActionListener {
    JLabel titulo;
    JButton volver;
    JLabel texto;
    ImageIcon imagenFondo;

    PanelVersion() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        titulo = new JLabel("PANDEMIC");
        titulo.setFont(new Font("Courier New", Font.BOLD, 150));
        titulo.setForeground(Color.WHITE);
        titulo.setAlignmentX(CENTER_ALIGNMENT);
        
        imagenFondo = new ImageIcon("src/Imagenes/o.jpg");

        volver = new JButton("Volver");
        volver.addActionListener(this);
        volver.setAlignmentX(CENTER_ALIGNMENT);
        
        texto = new JLabel("Versión 1.0");
        texto.setFont(new Font("Courier New", Font.BOLD, 50));
        texto.setForeground(Color.WHITE);
        texto.setAlignmentX(CENTER_ALIGNMENT);

        add(Box.createVerticalGlue());
        add(titulo);
        add(Box.createVerticalStrut(25));
        add(texto);
        add(Box.createVerticalStrut(50));
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