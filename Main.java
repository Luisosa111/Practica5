public class Main {
    public static void main(String[] args) {
        // Dibujar el trébol en negro
        Trebol trebol = new Trebol();
        trebol.dibujar(100, 100, "black");

        // Dibujar el corazón en rojo
        Corazon corazon = new Corazon();
        corazon.dibujar(50, 50);  // El corazón se dibujará de color rojo

        // Dibujar la pica en negro
        Pica pica = new Pica();
        pica.dibujar(50, 50, "black");
        
        Diamante diamante = new Diamante();
        diamante.dibujar(2, 2, "red"); // La pica se dibujará de color negro
    }
}
