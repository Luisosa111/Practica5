public class Carta {
    private int valor; 
    private Palo palo;
    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    // Método 
    public String toString() {
        return "Carta: " + valor + " de " + palo;
    }
}

