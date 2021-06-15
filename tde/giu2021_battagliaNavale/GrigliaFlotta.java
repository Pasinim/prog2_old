import java.util.Objects;

/**
 * OVERVIEW: Le istanze di questa classe rappresentano una sottoclasse di Grigia e rappresentano
 * la griglia delle navi del giocatore 
 * ABS FUN:
 * REP INV: 
 */

public class GrigliaFlotta extends Griglia {
    //devo accedere alle coordinate per inserire navi e per i colpi

    public GrigliaFlotta() {
        super();
    }
    
    /**
     * EFFECTS: inserisce la nave n nella griglia this. 
     *          Se n == null solleva una eccezione
     * @param n Nave da inserire
     */
    public void addNave(Nave n) {
        Objects.requireNonNull(n);
        //devo trovare la coordinata nella griglia
        for (Coordinata c : n.posizione) {
            this.modifica(this.griglia[c.x][c.y], n.nome);
            this.modifica(c, n.nome);
        }
    }

    public void colpito(Coordinata c, Nave n) {
        this.modifica(this.griglia[c.x][c.y], '*');
        n.aggiungiDanno();
    }
    

}