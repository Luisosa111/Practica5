public enum Palo {
    CORAZONES("♥"),
    DIAMANTES("♦"),
    TREBOLES("♣"),
    PICAS("♠");

    private final String simbolo;

    Palo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void dibujar(int x, int y) {
        System.out.println("Dibujando palo " + simbolo + " en (" + x + ", " + y + ")");
        // Aquí puedes dibujar una forma gráfica usando Cuadrado, Circulo, etc., si quieres.
    }
}
