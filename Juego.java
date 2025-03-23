import java.util.ArrayList;
import java.util.List;

public class Juego {
    public static void main(String[] args) {
        // Crear el mazo y barajarlo
        Mazo mazo = new Mazo();
        mazo.barajar();

        // Crear jugadores
        Jugador jugador1 = new Jugador("Carlos");

        // Repartir 3 cartas al jugador
        List<Carta> cartasJugador = mazo.repartir(3);

        // Definir posiciones en la pantalla
        List<Posicion> posiciones = new ArrayList<>();
        posiciones.add(new Posicion(50, 50));   // Primera carta
        posiciones.add(new Posicion(150, 50));  // Segunda carta
        posiciones.add(new Posicion(250, 50));  // Tercera carta

        // Mostrar las 3 cartas gráficamente
        Visualizador.mostrarCartas(cartasJugador, posiciones);
    }
}
