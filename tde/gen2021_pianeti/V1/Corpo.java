package tde.gen2021_pianeti;
/**
 * Classe astratta che rappresenta un corpo celeste
 * Ogni corpo celeste è identificato da un nome e da una posizione
 * ABS INV: nome != null
 */
public abstract class Corpo {
    private final String nome;
    private int e_cinetica;
    private int e_potenziale;
    private long e_tot;
//    private Punto posizione;

    /**
     * Inizializza un nuovo corpo celeste. Nome deve contenere un riferimento != null
     * @param nome
     */
    public Corpo(String nome, int k, int u){
        if (nome == null) throw new IllegalArgumentException("Nome non può essere null");
        this.nome = nome;
        this.e_cinetica = k;
        this.e_potenziale = u;
        this.e_tot = this.e_cinetica + this.e_potenziale;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Corpo)) return false;
        Corpo other = (Corpo) obj;
        if (!(other.getNome().equals(this.getNome())))
            return false;
        return true;
    };

}
