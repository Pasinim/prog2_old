package giu2021_battagliaNavale;
import java.util.*;

/**
 * Le istanze di questa classe rappresentano la griglia della flotta di un giocatore.
 * Memorizza eventuali danni ricevuti e indica al giocatore avversario l'estito del suo attacco
 * AF e RI sono uguali alla superclasse!
 */
public class GrigliaFlotta extends Griglia {
    public final List<Nave> navi;
    public GrigliaFlotta(List<Nave> n){
        super();
        Objects.requireNonNull(n);
        this.navi = n;
        aggiornaGriglia();
    }

    /**
     * Si aggiornano i valori della griglia in cui sono state posizionate le navi
     */
    public void aggiornaGriglia(){
        for (Nave n : this.navi)
            for (Coordinata c : n.posizione)
                this.griglia[c.x][c.y].updateValore(c.getValore()); 
    }

    //he per poter comunicare all'avversario l'esito dei suoi attacchi.
    public boolean esitoAttacco(Coordinata c){
        return true;
    } 
}
