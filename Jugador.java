import java.util.ArrayList;
import java.util.List;

public class Jugador {
    public String nombre; 
    private List<Carta> mano;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    // Método 
    public void asignarCartas(List<Carta> cartas) {
        mano.addAll(cartas);
    }

    // Método
    public void descartarCarta(Carta carta) {
        mano.remove(carta);
    }

    // Método 
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Jugador: " + nombre + "\nCartas: ");
        for (Carta carta : mano) {
            info.append("\n  - ").append(carta);
        }
        return info.toString();
    }
}
