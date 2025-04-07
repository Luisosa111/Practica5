public class Trebol {
    public void dibujar(int xPos, int yPos, String color) {
        // Cuadro central
        Cuadrado centro = new Cuadrado(20, xPos, yPos);
        centro.changeColor(color);
        centro.makeVisible();

        // Cuadro izquierdo
        Cuadrado izquierda = new Cuadrado(20, xPos - 10, yPos);
        izquierda.changeColor(color);
        izquierda.makeVisible();

        // Cuadro derecho
        Cuadrado derecha = new Cuadrado(20, xPos + 10, yPos);
        derecha.changeColor(color);
        derecha.makeVisible();

        // Cuadro arriba
        Cuadrado arriba = new Cuadrado(20, xPos, yPos - 10);
        arriba.changeColor(color);
        arriba.makeVisible();
    }
}
