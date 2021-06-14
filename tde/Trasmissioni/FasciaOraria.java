package Trasmissioni;
/**
 * Le istanze di questa classe rappresentano una fascia oraria del pianeta
 * Betazed, identificato da betaorario di inizio e da una durata.
 * ABS FUN:
 * REP INV: fine deve cascare nellos tesso giorno
 */
public class FasciaOraria {
    public final Betaorario inizio;
    public final Betaorario fine;
    public final int durata;
    
    public FasciaOraria(Betaorario inizio, int durata){
        
        this.inizio = inizio;
        this.durata = durata;
        
    }

}
