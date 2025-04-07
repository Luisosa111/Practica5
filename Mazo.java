import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;          
    private List<Carta> cartasRepartidas; 
    public Mazo() {
        this.cartas = new ArrayList<>();
        this.cartasRepartidas = new ArrayList<>();
        inicializarMazo();
    }
       public void inicializarMazo() {
        cartas.clear(); 
        for (Palo palo : Palo.values()) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(valor, palo));  
            }
        }
        cartasRepartidas.clear(); 
    }
       public void barajar() {
        Collections.shuffle(cartas);  
    }
    public List<Carta> repartirCartas(int numeroDeCartas) {
        List<Carta> cartasRepartidasAHora = new ArrayList<>();
        for (int i = 0; i < numeroDeCartas; i++) {
            Carta carta = cartas.remove(0); 
            cartasRepartidas.add(carta);     
            cartasRepartidasAHora.add(carta); 
        }
        return cartasRepartidasAHora; 
    }
    public void devolverCarta(Carta carta) {
        cartas.add(carta);                  
        cartasRepartidas.remove(carta);     
    }
    public List<Carta> obtenerCartasDisponibles() {
        return new ArrayList<>(cartas);  
    }
    public List<Carta> obtenerCartasRepartidas() {
        return new ArrayList<>(cartasRepartidas);
    }
}
