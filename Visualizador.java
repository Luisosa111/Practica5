public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        // Representar la carta como un cuadrado
        Cuadrado cartaCuadrado = new Cuadrado(60, p.getX(), p.getY());
        cartaCuadrado.makeVisible();

        // Dibujar el valor de la carta como círculos
        int valor = c.getValor();
        for (int i = 0; i < valor; i++) {
            Circulo circulo = new Circulo(5, p.getX() + (i * 12), p.getY() + 10);
            circulo.makeVisible();
        }

        // Dibujar el símbolo del palo en la carta (usando enum)
        c.getPalo().dibujar(p.getX(), p.getY() + 40); // Lo dibujamos más abajo del valor
    }
}
