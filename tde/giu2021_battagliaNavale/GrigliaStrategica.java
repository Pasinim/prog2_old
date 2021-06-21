package giu2021_battagliaNavale;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano una griglia strategica che 
 * tiene traccia dell'esito degli attacchi sulla flotta avversaria
 * effettuati dal giocatore
 */
public class GrigliaStrategica extends Griglia{
    private List<Coordinata> attacchi;
    private GrigliaFlotta flottaAvversaria;
    public GrigliaStrategica(){
        super();
        attacchi = new ArrayList<Coordinata>();
    }

    /**
     * esegue un attacco nella posizione della coordinata indicata.
     * Se la coordinata è già stata attaccata in passato solleva una eccezione
     * Se c è null solleva una eccezione
     * @param c Coordinata da attaccare
     */ 
    public void nuovoAttacco(Coordinata c){
        Objects.requireNonNull(c);
        if (attacchi.contains(c)) throw new IllegalArgumentException("La coordinata è già stata attaccata");
        attacchi.add(c);
        aggiornaGriglia();
    }
    
    /**
     * Aggiorna i valori della griglia:
     *      . se l'attacco non ha avuto successo
     *      * se l'attacco ha avuto successo 
     *      # se la nave è stata affondata
     */
    public void aggiornaGriglia(){
        for (Coordinata c : attacchi){
            if (flottaAvversaria.esitoAttacco(c))
                this.griglia[c.x][c.y].updateValore('*');
            else 
                this.griglia[c.x][c.y].updateValore('.');
        }
    }
    @Override
    public String toString(){
        return "allalala";
    }

}
