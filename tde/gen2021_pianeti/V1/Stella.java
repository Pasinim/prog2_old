package tde.gen2021_pianeti;

/**
 * Le istanze di questa classe rappresentano una stella.
 * Una stella è identificata da un nome e da una posizione (immutabile)
 */
public class Stella extends Corpo{
    private final Punto posizione;
    /**
     * Inizializza una nuova stella
     * @param nome Nome della Stella
     * @param pos Posizione della stella
     */
    public Stella (String nome, Punto pos){
        super(nome, 0, 0);
        this.posizione = pos;
    }

    @Override 
    public String toString(){
        String str = this.getNome() + ": " + this.posizione.toString();
        return str;
    }
    
    @Override 
    public boolean equals(Object obj){
        super.equals(obj);
        if (!(obj instanceof Stella)) return false;
        Stella other = (Stella) obj;
        if (!(other.posizione.equals(this.posizione)))
            return false;
        return true;
    }
}
