public class Triangulo extends Triangle {
    public Triangulo(int height, int width, int x, int y, String color) {
        // Cambiar tamaño del triángulo
        changeSize(height, width);
        
        // Mover el triángulo a la posición especificada
        moveHorizontal(x);
        moveVertical(y);
        
        // Cambiar el color del triángulo
        changeColor(color);
    }
}
