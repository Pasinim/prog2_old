package gen2021_pianeti.V2;

import java.util.*;

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
public class Pianeta extends CorpoCeleste {

    private Punto velocita;
    private long potenziale;
    private long cinetica;

    /**
     * Inizializza un nuovo pianeta con un certo nome ed una certa posizione. 
     * Inizialmente la velocità è nulla e di conseguenza anche U.
     */
    public Pianeta(String nome, Punto posizione){
        super(nome, posizione);
        this.velocita = new Punto (0, 0, 0);
        this.potenziale = 0;
        this.cinetica = posizione.norma();
    }
    /**
     * Restituisce la velocità di this.
     * @return this.velocita
     */
    public Punto getVelocita(){
        return this.velocita;
    }

    /**
     * Aggiorna la velocità di this valutando l'iterazione con c.
     * se x > x', l'ascissa della velocità di A aumenta di 1;
     * se x < x', l'ascissa della velocità di A diminuisce di 1.
     * Se c è una stella fissa la sua velocità e U è sempre 0
     * @param c Corpo celeste che interagisce di cñ
     */
    public void aggiornaVelocita(CorpoCeleste c){
        if (c instanceof StellaFissa){
            if (this.getPosizione().x > 0) 
               velocita.somma(new Punto (1, 0, 0));
               if (this.getPosizione().x < 0) 
               velocita.sottrai(new Punto (1, 0, 0));
        }
        if (c instanceof Pianeta){
            if (this.getPosizione().x > c.getPosizione().x) 
                velocita.somma(new Punto (1, 0, 0));
               if (this.getPosizione().x < c.getPosizione().x) 
                velocita.sottrai(new Punto (1, 0, 0));
        }
        this.aggiornaU();
    }

    public void aggiornaPosizione(CorpoCeleste c){
        if (c instanceof StellaFissa){
            if (this.getVelocita().x > 0) 
               this.setPosizione(getPosizione().somma(new Punto (1, 0, 0)));
            if (this.getVelocita().x < 0) 
               this.setPosizione(getPosizione().sottrai(new Punto (1, 0, 0)));
        }
        if (c instanceof Pianeta){
            if (this.getPosizione().x > c.getPosizione().x) 
                this.setPosizione(getPosizione().somma(new Punto (1, 0, 0)));
            if (this.getPosizione().x < c.getPosizione().x) 
                this.setPosizione(getPosizione().sottrai(new Punto (1, 0, 0)));
        }
        this.aggiornaK();
    }

    /**
     * Aggiorna il valore dell'energia cinetica
     */
    public void aggiornaK(){
        this.cinetica = this.getPosizione().norma();
    }
    /**
     * Aggiorna il valore dell'energia potenziale
     */
    public void aggiornaU(){
        this.potenziale = this.getVelocita().norma();
    }
    @Override
    public long getK() {
        return this.cinetica;
    }
    @Override
    public long getU() {
        return this.potenziale;
    }

    public static void main(String[] args) {
        CorpoCeleste p1 = new Pianeta("Giove", new Punto(5, 0, 0));
        CorpoCeleste p2 = new Pianeta("Marte", new Punto(3, 0, 0));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}