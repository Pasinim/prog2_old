package giu2021_battagliaNavale;
import java.util.*;
/**
* Le istanze di questa classe rappresentano una nave, che ha un certo orientamento./////
* RI: danniSubiti <= tipo.numPosizioni
    Per ogni Coordinata in Posizione: 
 */

public class Nave {
    public final List<Coordinata> posizione;
    private int danniSubiti;
    private boolean affondata;
    public final boolean isVertical;
    public final Tipo tipo;

    /**
     * Inizializza una nuova nave di tipo tipo e con un orientamento orizzontale
     * oppure verticale. Nel caso in cui l'orientamento sia diverso da V o O solleva una eccezione
     * Nel caso in cui tipo sia null solleva una eccezione.
     * @param tipo Tipo della nave
     * @param orientamento V se verticale, O se orizzontale
     */
    public Nave(Tipo tipo, boolean orientamento, Coordinata posIniziale){
        this.tipo = tipo;
        this.isVertical= orientamento;
        
    }



    public String toString(){
        //Per accedere al nome del tipo utilizzo this.tipo.name();
        String str = this.tipo.name() + ":";
        for (Coordinata c : this.posizione)
            str += c.toString() + ":";
        if (isVertical == true) str += 'V';
        else str += 'O';
        str += "\n";
        return str;
    }

    private boolean repOK(){
        return true;
    }
    
}
