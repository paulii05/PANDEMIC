package Menú;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelInformacion extends JPanel implements ActionListener {
    JButton volver;
    ImageIcon imagenFondo;
    JLabel informacion;

    PanelInformacion() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        imagenFondo = new ImageIcon("src/Imagenes/e.jpg");

        JPanel contenido = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        contenido.setLayout(new BoxLayout(contenido, BoxLayout.Y_AXIS));

        JLabel titular = new JLabel("PANDEMIC");
        titular.setFont(new Font("Courier New", Font.BOLD, 150));
        titular.setForeground(new Color (191, 255, 0));
        titular.setAlignmentX(CENTER_ALIGNMENT);
        contenido.add(Box.createVerticalStrut(25));
        contenido.add(titular);
        contenido.add(Box.createVerticalStrut(25));
        
        JLabel titulo = new JLabel("INFORMACIÓN SOBRE EL JUEGO");
        titulo.setFont(new Font("Courier New", Font.BOLD, 30));
        titulo.setForeground(Color.WHITE);
        titulo.setAlignmentX(CENTER_ALIGNMENT);
        contenido.add(Box.createVerticalStrut(25));
        contenido.add(titulo);
        contenido.add(Box.createVerticalStrut(25));

        informacion = new JLabel("<html><div style='text-align:justify; margin-left:20px; margin-right:20px;'>Pandemic es un juego de mesa de la editorial Asmodee en el que nos convertimos en miembros de un equipo de control de enfermedades que luchan juntos por controlar y acabar con las 4 temidas enfermedades que hostigan el mundo entero, poniendo en peligro a la especie humana. Un juego cooperativo en el que debemos viajar entre países, acumular información de cada enfermedad e ir atacando para lograr erradicar las enfermedades, pero sobre todo nuestra misión es encontrar las 4 curas que reduzca la curva de contagios. Debemos conseguirlo antes de que sea demasiado tarde…</div></html>");
        informacion.setFont(new Font("Courier New", Font.PLAIN, 15));
        informacion.setForeground(Color.WHITE);
        informacion.setAlignmentX(CENTER_ALIGNMENT);
        informacion.setVerticalAlignment(JLabel.TOP);
        informacion.setPreferredSize(new Dimension(780, 450));
        contenido.add(informacion);
        contenido.add(Box.createVerticalStrut(50));

        JLabel reglasTitulo = new JLabel("REGLAS DEL JUEGO");
        reglasTitulo.setFont(new Font("Courier New", Font.BOLD, 30));
        reglasTitulo.setForeground(Color.WHITE);
        reglasTitulo.setAlignmentX(CENTER_ALIGNMENT);
        contenido.add(reglasTitulo);
        contenido.add(Box.createVerticalStrut(25));

        JLabel pandemiTitulo = new JLabel("¿Cómo se juega a Pandemic?");
        pandemiTitulo.setFont(new Font("Courier New", Font.BOLD, 25));
        pandemiTitulo.setForeground(Color.WHITE);
        pandemiTitulo.setAlignmentX(CENTER_ALIGNMENT);
        contenido.add(pandemiTitulo);
        contenido.add(Box.createVerticalStrut(15));

        JLabel reglasText = new JLabel("<html><div style='text-align:justify; margin-left:20px; margin-right:20px;'>" +
            "1. <b>Realizar acciones:</b><br>" +
            "   - Los jugadores pueden realizar hasta 4 acciones por turno.<br>" +
            "   - Las acciones incluyen:<br>" +
            "     - Viajar utilizando diferentes medios de transporte: tierra-mar (movimiento corto) o vuelos directos, chárter o puente aéreo (movimientos más lejanos).<br>" +
            "     - Construir centros de investigación.<br>" +
            "     - Tratar enfermedades.<br>" +
            "     - Compartir información con otros jugadores.<br>" +
            "     - Descubrir una cura con 5 cartas del mismo color en un centro de investigación.<br>" +
            "   - Las acciones se seleccionan haciendo clic en las opciones disponibles en la pantalla.<br>" +
            "   - Las cartas utilizadas se muestran en una pila de descartes.<br><br>" +
            "2. <b>Robar cartas:</b><br>" +
            "   - Después de realizar acciones, los jugadores roban 2 cartas del mazo de jugadores.<br>" +
            "   - El límite de cartas en mano es 7. Si se supera, se deben descartar cartas.<br>" +
            "   - Se pueden utilizar eventos en cualquier momento del turno.<br>" +
            "   - Si se roba una carta de Epidemia, se desencadenan las siguientes acciones automáticamente: propagar, infectar e intensificar.<br><br>" +
            "3. <b>Infectar ciudades:</b><br>" +
            "   - En esta fase, se revelan tantas cartas del mazo de infección como indique el nivel de propagación (de 2 a 4 cartas).<br>" +
            "   - Se coloca automáticamente 1 cubo de enfermedad en la ciudad de cada carta revelada.<br>" +
            "   - Las ciudades pueden contener como máximo 3 cubos de enfermedad. Si se excede este límite, se produce un brote que infecta a ciudades cercanas.<br>" +
            "   - Se muestra un indicador de brotes para mantener un seguimiento visual de la situación.<br><br>" +
            "4. <b>Fin del turno:</b><br>" +
            "   - Una vez completadas todas las acciones, el turno del jugador termina y pasa al siguiente jugador en sentido horario.<br>" +
            "   - Se fomenta la colaboración y la discusión entre los jugadores para tomar decisiones estratégicas.</div></html>");
        reglasText.setFont(new Font("Courier New", Font.PLAIN, 15));
        reglasText.setForeground(Color.WHITE);
        reglasText.setAlignmentX(CENTER_ALIGNMENT);
        reglasText.setVerticalAlignment(JLabel.TOP);
        reglasText.setPreferredSize(new Dimension(780, 450));
        contenido.add(reglasText);
        contenido.add(Box.createVerticalStrut(75));
        
        JLabel pandemiFinal = new JLabel("Fin de la partida");
        pandemiFinal.setFont(new Font("Courier New", Font.BOLD, 25));
        pandemiFinal.setForeground(Color.WHITE);
        pandemiFinal.setAlignmentX(CENTER_ALIGNMENT);
        contenido.add(pandemiFinal);
        contenido.add(Box.createVerticalStrut(15));
        
        JLabel finText = new JLabel("<html><div style='text-align:justify; margin-left:20px; margin-right:20px;'>" +
            "La partida en nuestro juego puede concluir con una victoria mundial o con un desastre sanitario. Los jugadores ganan si descubren las 4 curas de las enfermedades a tiempo (no es necesario erradicarlas).<br><br>" +
            "Sin embargo, la derrota puede ocurrir de 3 formas distintas, así que debemos prestar atención a estos indicadores de crisis sanitaria:<br>" +
            "1. **Indicador de brotes:** Si el indicador de brotes alcanza la última casilla del marcador, la situación es crítica y los contagios son incontrolables. ¡El símbolo de calavera no es una buena señal!<br>" +
            "2. **Escasez de cubos:** Si no quedan suficientes cubos de alguna de las 4 enfermedades en el almacén para colocar en el tablero, esa enfermedad ha ganado la batalla.<br>" +
            "3. **Agotamiento de cartas:** Si un jugador no puede robar 2 cartas del mazo de ciudades y eventos debido a la falta de recursos, la situación es desesperada.<br><br>" +
            "Si ocurre alguna de estas situaciones durante la partida, el juego termina de inmediato. No se completa el turno del jugador activo.</div></html>");
        finText.setFont(new Font("Courier New", Font.PLAIN, 15));
        finText.setForeground(Color.WHITE);
        finText.setAlignmentX(CENTER_ALIGNMENT);
        finText.setVerticalAlignment(JLabel.TOP);
        finText.setPreferredSize(new Dimension(780, 450));
        contenido.add(finText);

        volver = new JButton("Volver");
        volver.setAlignmentX(CENTER_ALIGNMENT);
        volver.addActionListener(this);
        contenido.add(Box.createVerticalStrut(25));
        contenido.add(volver);

        JScrollPane scrollPane = new JScrollPane(contenido);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setAlignmentX(CENTER_ALIGNMENT);
        add(scrollPane);
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