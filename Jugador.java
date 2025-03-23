import java.util.ArrayList;
import java.util.List;
public class Jugador {
    public String nombre; // Modificable directamente
    private List<Carta> mano;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    // Método para asignar cartas al jugador
    public void asignarCartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    // Método para descartar una carta de la mano
    public void descartarCarta(Carta carta) {
        mano.remove(carta);
    }

    // Método para obtener información del jugador y sus cartas
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Jugador: " + nombre + "\nCartas: ");
        for (Carta carta : mano) {
            info.append("\n  - ").append(carta);
        }
        return info.toString();
    }
}
