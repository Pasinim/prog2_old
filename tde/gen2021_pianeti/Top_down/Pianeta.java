package gen2021_pianeti.Top_down;

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
    
    private int velocita;
    private int potenziale;
    private int cinetica;

    public Pianeta(String nome, Punto posizione){
        super(nome, posizione);
        this.cinetica = posizione.norma();
        this.velocita = 0;
        this.potenziale = 0;
    }



    private void iterazioneStella(StellaFissa s){
        Punto x = new Punto(1, 0, 0);
        Punto y = new Punto(0, 1, 0);
        Punto z = new Punto(0, 0, 1);
        if (this.getPosizione().x > 0)
            this.setPosizione(this.getPosizione().somma(x));
        if (this.getPosizione().x < 0)
            this.setPosizione(this.getPosizione().sottrai(x));

        if (this.getPosizione().y > 0)
            this.setPosizione(this.getPosizione().somma(y));
        if (this.getPosizione().y < 0)
            this.setPosizione(this.getPosizione().sottrai(y));    

        if (this.getPosizione().z > 0)
            this.setPosizione(this.getPosizione().somma(z));
        if (this.getPosizione().z < 0)
            this.setPosizione(this.getPosizione().sottrai(z));    

    }

    /**
     * Durante una iterazione viene modificata la velocità ed anche la posizione
     * se x > x', l'ascissa della velocità di A aumenta di 1;
     * se x < x', l'ascissa della velocità di A diminuisce di 1.
     */    
    @Override
    public void iterazione(CorpoCeleste c) {
        if (c instanceof StellaFissa)
            iterazioneStella(c);
        

        
        if (this.getPosizione().x > c.getPosizione().x){
            this.getPosizione().somma(x);
            c.getPosizione().sottrai(x);
        }
        else if (this.getPosizione().x < c.getPosizione().x){
            this.getPosizione().somma(x);
            c.getPosizione().sottrai(x);
        } 
        
    }

    @Override
    public int getK() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getU() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getVelocita() {
        // TODO Auto-generated method stub
        return 0;
    }

    
}
