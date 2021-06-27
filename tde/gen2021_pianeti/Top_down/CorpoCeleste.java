package gen2021_pianeti.Top_down;
import java.util.*;

public abstract class CorpoCeleste {
    private Punto posizione; //non può essere final perchè i pianeti si muovono
    public final String nome;
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
        this.posizione = p;
    }
    
    public abstract int getK();
    public abstract int getU();
    public abstract int getVelocita();
    public abstract void iterazione(CorpoCeleste c );

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof CorpoCeleste)) return false;
        CorpoCeleste o = (CorpoCeleste) obj;
        if (!(this.nome.equals(o.nome))) return false;
        return true;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", nome,  posizione.toString());
    }
}

