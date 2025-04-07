public class Cuadrado extends Square {

    public Cuadrado(int size, int x, int y) {
        changeSize(size);  // Cambiar el tamaño del cuadrado
        moveHorizontal(x); // Posición en X
        moveVertical(y);   // Posición en Y
    }

    // Método para cambiar el color a rojo
    public void cambiarColorRojo() {
        changeColor("red");  // Usamos el método changeColor para cambiar el color a rojo
    }
}
