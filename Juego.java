import java.util.List;

public class Juego {
    public static void main(String[] args) {
    
        Mazo mazo = new Mazo();
        mazo.barajar();

    
        Jugador jugador1 = new Jugador("Carlos");
        Jugador jugador2 = new Jugador("Ana");

        
        jugador1.asignarCartas(mazo.repartir(5));
        jugador2.asignarCartas(mazo.repartir(5));

        System.out.println(jugador1);
        System.out.println(jugador2);

        // Simular que un jugador devuelve una carta
        if (!jugador1.toString().isEmpty()) {
            Carta cartaDevuelta = jugador1.toString().contains("A") ? null : mazo.repartir(1).get(0);
            if (cartaDevuelta != null) {
                jugador1.descartarCarta(cartaDevuelta);
                mazo.agregarCarta(cartaDevuelta);
                System.out.println("\n" + jugador1.nombre + " devolvió la carta: " + cartaDevuelta);
            }
        }

        // Mostrar el estado del mazo después de devolver una carta
        System.out.println("\nCartas restantes en el mazo:");
        mazo.mostrarMazo();
    }
}
