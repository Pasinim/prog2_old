package giu2021_battagliaNavale;
import java.util.*;

/**
 * Le istanze di questa classe rappresentano la griglia della flotta di un giocatore.
 * Memorizza eventuali danni ricevuti e indica al giocatore avversario l'estito del suo attacco
 * AF e RI sono uguali alla superclasse.
 */
public class GrigliaFlotta extends Griglia {
    public final List<Nave> navi;
    
    public GrigliaFlotta(){
        super();
        this.navi = new ArrayList<Nave>();
        //qui aggiorna la griglia andando ad inserire i nomi delle nabi
        // for (Nave x : this.navi)
        //     for (Coordinata c : x.posizione)
        //         this.griglia[c.x][c.y].updateValore(c.getValore()); 
    }

    public void addNave(Nave n){
        navi.add(n);
        for (Coordinata c : n.posizione)
            this.griglia[c.x][c.y].updateValore(c.getValore());
    }

    /**
     * Restituisce true se nella coordinata C è presenta una nave, false altrimenti
     */
    public boolean isAHit(Coordinata c){
        if (this.griglia[c.x][c.y].getValore() != '~')
            return true;
        return false;
    }

    /**
     * Modifica il valore della coordinata c (con '*') in this se è presente una nave.
     * Questo significa che una nave è stata colpita
     * @param c Coordinata su cui è stato eseguito l'attacco
     */
    @Override
    public void hit(Coordinata c, GrigliaFlotta avversario){
        Objects.requireNonNull(c);
        if (this.griglia[c.x][c.y].getValore() != '~')
            this.griglia[c.x][c.y].updateValore('*');
    }

	// @Override
	// public char getValore(Coordinata c) {

    //     return 0;
	// } 

    
}
