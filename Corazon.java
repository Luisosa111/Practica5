public class Corazon {
    public void dibujar(int xPos, int yPos) {
        // Crear los cuadros para formar el corazón
        Cuadrado centro = new Cuadrado(20, xPos, yPos);
        centro.cambiarColorRojo();  // Cambiar color a rojo
        centro.makeVisible();

        Cuadrado izquierda = new Cuadrado(20, xPos - 10, yPos);
        izquierda.cambiarColorRojo();  // Cambiar color a rojo
        izquierda.makeVisible();

        Cuadrado derecha = new Cuadrado(20, xPos + 10, yPos);
        derecha.cambiarColorRojo();  // Cambiar color a rojo
        derecha.makeVisible();

        Cuadrado arriba = new Cuadrado(20, xPos, yPos - 10);
        arriba.cambiarColorRojo();  // Cambiar color a rojo
        arriba.makeVisible();
    }
}
