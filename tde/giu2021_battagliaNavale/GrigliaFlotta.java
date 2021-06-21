package giu2021_battagliaNavale;
import java.util.*;

/**
 * Le istanze di questa classe rappresentano la griglia della flotta di un giocatore.
 * Memorizza eventuali danni ricevuti e indica al giocatore avversario l'estito del suo attacco
 * AF e RI sono uguali alla superclasse.
 */
public class GrigliaFlotta extends Griglia {
    public final List<Nave> navi;
    public GrigliaFlotta(List<Nave> n){
        super();
        Objects.requireNonNull(n);
        this.navi = n;
        //qui aggiorna la griglia andando ad inserire i nomi delle nabi
        for (Nave x : this.navi)
            for (Coordinata c : x.posizione)
                this.griglia[c.x][c.y].updateValore(c.getValore()); 
    }

    /**
     * Modifica il valore della coordinata c (con '*') in this se è presente una nave.
     * Questo significa che una nave è stata colpita
     * @param c Coordinata su cui è stato eseguito l'attacco
     */
    @Override
    public void hit(Coordinata c){
        Objects.requireNonNull(c);
        if (this.griglia[c.x][c.y].getValore() != '~')
            this.griglia[c.x][c.y].updateValore('*');
    } 

    
}
