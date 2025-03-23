import javax.swing.*;
import java.awt.*;
import java.util.List;

class Visualizador extends JPanel {
    private List<Carta> cartas;
    private List<Posicion> posiciones;

    public Visualizador(List<Carta> cartas, List<Posicion> posiciones) {
        this.cartas = cartas;
        this.posiciones = posiciones;
        setPreferredSize(new Dimension(500, 500)); // Tamaño del panel
        setBackground(Color.WHITE); // Fondo blanco
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = 80;
        int height = 120;

        for (int i = 0; i < cartas.size(); i++) {
            int x = posiciones.get(i).getX();
            int y = posiciones.get(i).getY();
            Carta carta = cartas.get(i);

            // Dibujar el rectángulo de la carta
            g.setColor(Color.BLACK);
            g.fillRect(x, y, width, height);
            g.setColor(Color.WHITE);
            g.fillRect(x + 2, y + 2, width - 4, height - 4);

            // Dibujar el valor y el palo de la carta
            g.setColor(Color.BLACK);
            g.setFont(new Font("SansSerif", Font.BOLD, 14));
            g.drawString(carta.toString(), x + 10, y + 60);
        }
    }

    public static void mostrarCartas(List<Carta> cartas, List<Posicion> posiciones) {
        JFrame frame = new JFrame("Visualizador de Cartas");
        Visualizador visualizador = new Visualizador(cartas, posiciones);

        frame.add(visualizador);
        frame.pack();  // Ajustar el tamaño al contenido
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Re-dibujar las cartas después de mostrar la ventana
        visualizador.repaint();
    }
}
