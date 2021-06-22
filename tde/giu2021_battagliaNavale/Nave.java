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
    public Nave(Tipo tipo, char orientamento, Coordinata posIniziale){
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(posIniziale);
        if (orientamento != 'V' && orientamento != 'O')
            throw new IllegalArgumentException("L'orientamento può essere orizzontale o verticale");
        this.posizione = new ArrayList<Coordinata>();
        this.danniSubiti = 0;
        this.affondata = false;
        this.tipo = tipo;
        if (orientamento == 'V') this.isVertical = true;
        else this.isVertical = false;
 
        System.out.println(String.format("Il tipo %s è lungo %d \n ", this.tipo.name(), this.tipo.numPosizioni));
        for (int i = 0; i < this.tipo.numPosizioni; i++){
            if (this.isVertical){
                Coordinata aggiungi = new Coordinata((char)(posIniziale.x + i), posIniziale.y);
                aggiungi.updateValore(this.tipo.name().charAt(0));
                this.posizione.add(aggiungi);
            }
            else{
                Coordinata aggiungi = new Coordinata((char)(posIniziale.x), posIniziale.y + i);
                aggiungi.updateValore(this.tipo.name().charAt(0));
                this.posizione.add(aggiungi);
            }
        }
        if (!repOK()) 
            throw new IllegalArgumentException("IR non rispettato");    
    }

    /**
     * Incrementa this.danniSubiti e modifica il valore della Coordinata c con '*' 
     * Se c è null solleva una eccezione
     * @param c Coordinata colpita
     */
    public void incrementaDanno(Coordinata c){
        Objects.requireNonNull(c);
        this.danniSubiti++;
        if (this.danniSubiti >= this.tipo.numPosizioni) this.affondata = true;
        int idx = posizione.indexOf(c);
        this.posizione.get(idx).updateValore('*');
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
