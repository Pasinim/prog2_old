package Trasmissioni;

/**
 * Le istanze di questa classe rappresentano una fascia oraria del pianeta
 * Betazed, identificato da betaorario di inizio e da una durata.
 * ABS FUN: AF(Inizio, fine)
 * REP INV: fine deve cascare nellos tesso giorno
 */
public class FasciaOraria {
    public final Betaorario inizio;
    public final Betaorario fine;
    public final int durata;
    /**
     * EFFECTS: Inizializza una nuova fascia oraria da this.inizio a this.fine
     * @param inizio Inizio della trasmissione
     * @param durata Durata della trasmissione
     */
    public FasciaOraria(Betaorario inizio, int durata){
        this.inizio = inizio;
        this.durata = durata;
        this.fine = inizio.addDurata(durata);
        if (this.fine.compareTo(this.inizio) < 0) 
            throw new IllegalArgumentException("Durata troppo grande. La fine deve essere nello stesso giorno dell'inizio.");      
    }
    /**
     * REQUIRES: o != null
     * EFFECTS: restituisce true se o interseca this
     * @param o Fascia oraria da confrontare
     * @return true se o interseca this
     */
    public boolean interseca(FasciaOraria o){
        return (o.inizio.compareTo(this.fine) < 0 && o.inizio.compareTo(this.inizio) > 0);
    }

    @Override
    public String toString(){
        return this.inizio.toString() + " - " + this.fine.toString();
    }
}
