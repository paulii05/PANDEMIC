package Menú;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marco extends JFrame {
    PanelPrincipal pp;
    Dimension screenSize;

    Marco() {
        this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("PANDEMIC");

        setLayout(new BorderLayout());

        pp = new PanelPrincipal();
        add(pp, BorderLayout.CENTER);

        setSize(screenSize);

        setVisible(true);
    }
}