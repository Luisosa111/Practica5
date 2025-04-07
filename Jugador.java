import java.util.ArrayList;
import java.util.List;

public class Jugador {
    public String nombre;               
    private List<Carta> mano;         
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();  
    }

    public void recibirCartas(List<Carta> nuevasCartas) {
        mano.addAll(nuevasCartas);       
    }

    public void descartarCarta(Carta carta) {
        mano.remove(carta);         
    }
  
    public void descartarTodasLasCartas() {
        mano.clear();         
    }

    public String informacionJugador() {
        StringBuilder info = new StringBuilder();
        info.append("Jugador: ").append(nombre).append("\nCartas en mano: \n");

        if (mano.isEmpty()) {
            info.append("No tiene cartas.");
        } else {
            for (Carta carta : mano) {
                info.append(carta).append("\n");  
            }
        }
        return info.toString();              
    }

    public List<Carta> obtenerCartasEnMano() {
        return new ArrayList<>(mano);             
    }
}