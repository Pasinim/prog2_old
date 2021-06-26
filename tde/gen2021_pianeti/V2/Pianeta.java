package gen2021_pianeti.V2;

import java.util.Objects;

/**
 * Le istanze di questa classe rappresentano un pianeta, la cui posizione
 * varia in funzione della loro velocità e la cui energia è pari
 * al prodotto tra quella cinetica e quella potenziale.
 * 
 * L'energia cinetica è data dalla norma della sua posizione.
 * L'energia potenziale è data dalla norma della sua velocità.
 * 
 * Le istanze di questa classe sono mutabili dato che un pianeta
 * può interagire con altri corpi celesti
 */
public class Pianeta {
    private Punto posizione;
    private Punto velocita;
    public final String nome;
    private long potenziale;
    private long cinetica;

    /**
     * Inizializza un nuovo pianeta con un certo nome ed una certa posizione. 
     * Inizialmente la velocità è nulla e di conseguenza anche U.
     * Se nome o posizione sono null solleva una eccezione. 
     * @param nome Nome del pianeta
     * @param posizione Posizione del pianeta
     */
    public Pianeta(String nome, Punto posizione){
        Objects.requireNonNull(nome);
        Objects.requireNonNull(posizione);
        this.nome = nome; 
        this.posizione = posizione;
        this.velocita = new Punto (0, 0, 0);
        this.potenziale = 0;
        this.cinetica = posizione.norma();
    }

    public void aggiornaVelocita(CorpoCeleste c){
        if (c instanceof StellaFissa){
            if (this.posizione.x > 0) 
               velocita.somma(new Punto (1, 0, 0));
               if (this.posizione.x < 0) 
               velocita.sottrai(new Punto (1, 0, 0));
        }
        if (c instanceof Pianeta){
            //Pianeta p2 = (Pianeta)c;
            if (this.posizione.x > c.posizione.x) 
                velocita.somma(new Punto (1, 0, 0));
               if (this.posizione.x < c.posizione.x) 
                velocita.sottrai(new Punto (1, 0, 0));
        }
    }

}
