public class Diamante {
    public void dibujar(int xPos, int yPos, String color) {
        // Triángulo superior (arriba)
        Triangulo arriba = new Triangulo(30, 30, xPos, yPos, color); // Primer triángulo en la parte superior
        arriba.makeVisible();

        // Triángulo inferior izquierdo
        Triangulo abajoIzquierda = new Triangulo(30, 30, xPos - 30, yPos + 30, color); // Triángulo izquierdo
        abajoIzquierda.makeVisible();

        // Triángulo inferior derecho
        Triangulo abajoDerecha = new Triangulo(30, 30, xPos + 30, yPos + 30, color); // Triángulo derecho
        abajoDerecha.makeVisible();
    }
}
