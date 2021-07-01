package gen2021_pianeti.Top_down;
import java.util.*;

/**
 * Le istanze di questa classe rappresentano un pianeta, la cui posizione
 * varia in funzione della velocità e la cui energia è pari
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
    // private int potenziale;
    // private int cinetica;

    public Pianeta(String nome, Punto posizione){
        super(nome, posizione);
        //this.cinetica = posizione.norma();
        this.velocita = new Punto(0, 0, 0);
        //this.potenziale = 0;
    }

    @Override
    public void setVelocita(Punto p){
        Objects.requireNonNull(p);
        if (this instanceof Pianeta)
            this.velocita = p;
    }

    @Override
    public int getK() {
        return this.getPosizione().norma();
    }

    @Override
    public int getU() {
        return this.getPosizione().norma();
    }

    @Override
    public Punto getVelocita() {
        return this.velocita;
    }

    @Override 
    public String toString(){
        //return this.toString() + ", Velocita: " + this.velocita.toString() + "\n";
        return String.format("%s: %s, Velocità: %s", nome,  getPosizione().toString(), velocita.toString());
    }
    
    @Override
    public boolean equals(Object obj){
        if (super.equals(obj)) return true;
        if (!(obj instanceof Pianeta)) return false;
        Pianeta o = (Pianeta) obj;
        if (!(this.nome.equals(o.nome))) return false;
        return true;
    }


    public static void main(String[] args) {
        CorpoCeleste p1 = new Pianeta("Marte", new Punto(1, 0 , 0));
        CorpoCeleste p2 = new StellaFissa("Pluto", new Punto(3, 3, 3));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
