package tde.gen2021_pianeti;
/**
 * Classe astratta che rappresenta un corpo celeste
 * Ogni corpo celeste è identificato da un nome e da una posizione
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

}
