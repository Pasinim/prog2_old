/*
FUNZIONE ASTRAZIONE:
Rappresentazione di una coordinata che individua la cella di un teramino.

La variabile x rappresenta le ascisse.
La variabile y rappresenta le ordinate.

Siccome questo tipo di dato è immutabile è legittimo dichiarare le sue variabili pubbliche.
*/
public class Coordinata{
    
    /*
    INVARIANTE DI RAPPRESENTAZIONE:

    Tutti gli stati sono legali.
    */
    public final int x;
    public final int y;    

    /*
    REQUIRES: -
    MODIFIES: -
    EFFECTS: Inizializza questa istanza con un valore per le ascisse ed uno per le ordinate
    */
    public Coordinata(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    /*
    REQUIRES: -
    MODIFIES: -
    EFFECTS: Ritorna una stringa che rappresenta lo stato di questa istanza
    */
    @Override
    public String toString(){
        return "<" + this.x + ", " + this.y + ">";
    }
}