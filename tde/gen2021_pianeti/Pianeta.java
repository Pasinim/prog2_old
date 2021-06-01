package tde.gen2021_pianeti;
/**
 * Le istanze di questa classe rappresentano un Pianeta, identificato da un nome e da una posizione.
 * Il pianeta possiede anche un'energia potenziale e cinetica, che possono cambiare nel tempo.
 */
public class Pianeta extends Corpo {
    private Punto posizione;
    private Punto velocita;
    /**
     * Inizializza un nuovo pianeta con velocità, energia potenziale e cinetica nulle
     * @param nome Nome del pianeta
     * @param pos Coordinata del pianeta
     */
    public Pianeta(String nome, Punto pos){
        super(nome, 0, 0);
        velocita = new Punto(0, 0, 0);
        this.posizione = pos;
    }

    public int getCinetica(){
        return posizione.norma();
    }

    public int getPotenziale(){
        return velocita.norma();
    }

    public int getVelocitaX(){
        return this.velocita.getCoordinate()[0];
    }

    public int getVelocitaY(){
        return this.velocita.getCoordinate()[1];
    }


    public void setVelocita(Punto vel2){
        Punto newVel = this.velocita.somma(vel2);
        this.velocita = newVel;
    }

    
    /**
     * EFFECTS: aumenta la veocità di una unità
     * @param isVertical true se la velocità è da incrementare lungo le ordinate, false altrimenti
     */
    public void aumentaVelocita(boolean isVertical){
        Punto newVelocita;
        if (isVertical)
        newVelocita = new Punto(0, 1, 0);
        else
        newVelocita = new Punto(1, 0, 0);
        this.setVelocita(newVelocita);
    }
    
    /**
     * EFFECTS: aumenta la veocità di una unità
     * @param isVertical true se la velocità è da incrementare lungo le ordinate, false altrimenti
     */
    public void diminuisciVelocita(boolean isVertical){
        Punto newVelocita;
        if (isVertical)
        newVelocita = new Punto(0, 1, 0);
        else
        newVelocita = new Punto(1, 0, 0);
        this.setVelocita(newVelocita);
    }
    /**
     * Modifica la velocità delle ordinate, delle ascisse e la quota in base 
     * alle coordinate dei pianeti A e B. Questo aggiornamento delle proprietà
     * avviene in un secondo.
     * @param B Pianeta 2
     */
    public void confrontaPianeti(Pianeta B){
        if (this.velocita.isAscissaMaggiore(B.velocita)){
            this.aumentaVelocita(false);
            B.diminuisciVelocita(false);
        }
        else {
            B.aumentaVelocita(false);
            this.diminuisciVelocita(false);
        }
        if (this.velocita.isOrdinataMaggiore(B.velocita)){
            this.aumentaVelocita(true);
            B.diminuisciVelocita(true);
        }
        else {
            B.aumentaVelocita(true);
            this.diminuisciVelocita(true);
        }
    }
}

