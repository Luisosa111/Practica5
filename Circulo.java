public class Circulo extends Circle {
    public Circulo(int diameter, int x, int y) {
        changeSize(diameter);
        moveHorizontal(x);
        moveVertical(y);
    }
}
