import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;

    // Constructor
    public Mazo() {
        cartas = new ArrayList<>();
        restablecerMazo();
    }

    // Método 
    public void restablecerMazo() {
        cartas.clear();
        for (Palo palo : Palo.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(valor, palo));
            }
        }
    }

    // Método 
    public void barajar() {
        Collections.shuffle(cartas);
    }

    // Método 
    public List<Carta> repartir(int numCartas) {
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numCartas && !cartas.isEmpty(); i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    // Método 
    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    // Método
    public void mostrarMazo() {
        for (Carta c : cartas) {
            System.out.println(c);
        }
    }
}
