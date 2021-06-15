import java.util.List;
import java.util.ArrayList;
/**
 * OVERVIEW: Sottoclasse di Nave che rappresenta una portaerei
 * ABS FUN: PPPPPPPP
 * REP INV: 
 */

public class Portaerei extends Nave {

    public final int lunghezza;
    /**
     * EFFECTS: inizializza una nuova portaerei
     * @param isVertical
     * @param coord
     */
    public Portaerei(char isVertical, Coordinata coord) {
        super(isVertical, coord);
        this.nome = 'P';
        this.lunghezza = 8;
        posizione = new ArrayList<Coordinata>();
        for (int i = 0; i < this.lunghezza; i++) {
            if (this.isVertical)
                this.posizione.add(this.posizione_iniziale.aggiungiOrdinata(i));
            else
                this.posizione.add(this.posizione_iniziale.aggiungiAscissa(i));
            this.posizione.get(i).setNave(this);
        }
    }

    //EFFECTS: se il danno è uguale alla dimensione della nave la nave affonda
    @Override
    public void aggiungiDanno() {
        this.danno++;
        if (this.danno == this.lunghezza)
            this.affonda = true;
    }

    @Override
    public String toString() {
        String str = "";
        for (Coordinata p : posizione)
            str += p.toString();
        return str;
    }

}