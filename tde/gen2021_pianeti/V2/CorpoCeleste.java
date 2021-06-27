package gen2021_pianeti.V2;
import java.util.*;
/**
 * Perchè faccio una interfaccia? Perchè la posizione delle stelle fisse non cambia mai
 * mentre quella dei pianeti si e con una classe astratta non posso avere public e final.
 * Posso farlo con una classe astratta in cui dichiaro semplicemento posizione e nome
 * 
 */
public abstract class CorpoCeleste {

    private Punto posizione;
    public final String nome;
    
    /**
     * restituisce l'energia cinetica di this
     * @return K di this
     */
    public abstract long getK();

    /**
     * restituisce l'energia potenziale di this
     * @return U di this
     */
    public abstract long getU();

    /**
     * Inizializza un nuovo corpo celeste con un certo nome e in una certa posizione
     * Se nome o posizione sono null solleva una eccezione. 
     * @param nome Nome del pianeta
     * @param posizione Posizione del pianeta
     */
    public CorpoCeleste(String nome, Punto posizione){
        Objects.requireNonNull(nome);
        Objects.requireNonNull(posizione);
        this.nome = nome; 
        this.posizione = posizione;
    }

    /**
     * Restituisce la posizione di this
     */
    public Punto getPosizione(){
        return this.posizione;
    }

    public void setPosizione(Punto p){
        Objects.requireNonNull(p);
        this.posizione = p; 
    }

    public String toString(){
        String str = String.format("%s = %s\n", this.nome, this.posizione.toString());
        return str;
    }
}

