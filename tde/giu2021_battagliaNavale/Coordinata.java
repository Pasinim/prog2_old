
/**
 * OVERVIEW: Le istanze di questa classe rappresentano una coordinata della griglia.
 * Le istanze di questa classe sono immutabili.
 * ABS FUN: AF(x, y) -> this.x + this.y
 * REP INV: 'A' - 65 <= x <= 'J' - 65 
 *          0 <= y <= 9 
 */

public class Coordinata {
    public final int x; //ascisse = lettere
    public final int y;
    private char contiene;

     /**
     * EFFECTS: Inizializza una nuova coordinata. 
     *          Se IR non è rispettato solleva una eccezione
     * @param x Ascissa
     * @param y Ordinata
     */
    public Coordinata(char x, int y) {
        this.x = x - 'A';
        this.y = y;
        this.contiene = '~';
        if (!repOK())
            throw new IllegalArgumentException();
    }

    public void setNave(Nave n) {
        this.contiene = n.nome;
    }

    public void modificaValore(char c) {
        this.contiene = c;
    }

    /**
     * EFFECTS: restituisce una nuova coordinata ottenuta sommando this.x con n
     * @param n Numero di ascisse da sommare
     * @return Nuova coordinata
     */
    public Coordinata aggiungiAscissa(int n) {
        Coordinata nuova = new Coordinata((char) (this.x + n + 'A'), this.y);
        return nuova;
    }
    
    /**
     * EFFECTS: restituisce una nuova coordinata ottenuta sommando this.y con n
     * 
     * @param n Numero di ordinate da sommare
     * @return Nuova coordinata
     */
    public Coordinata aggiungiOrdinata(int n) {
        Coordinata nuova = new Coordinata((char) (this.x + 'A'), this.y + n);
        return nuova;
    }

    /**
     * Implementazione dell'invariante di rappresentazione
     * @return true se IR è rispettato, false altrimenti
     */
    private boolean repOK() {
        return (x >= 'A' - 65 && x <= 'J' - 65 && y >= 0 && y <= 9);
    }

    @Override
    public String toString() {
        return "" + this.contiene;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Coordinata))
            return false;
        Coordinata o = (Coordinata) obj;
        if (this.x != o.x)
            return false;
        if (this.y != o.y)
            return false;
        return true;
    }


}