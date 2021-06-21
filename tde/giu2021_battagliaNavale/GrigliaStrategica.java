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
    public GrigliaStrategica(GrigliaFlotta flottaAvversaria){
        super();
        attacchi = new ArrayList<Coordinata>();
        this.flottaAvversaria = flottaAvversaria;
    }

    /**
     * Esegue un attacco nella posizione della coordinata indicata.
     * Se la nave è stata colpita il valore viene aggiornata con '*', '.' altrimenti
     * Se la coordinata è già stata attaccata in passato solleva una eccezione
     * Se c è null solleva una eccezione
     * @param c Coordinata da attaccare
     * @return true 
     */ 
    @Override
    public void hit(Coordinata c){
        Objects.requireNonNull(c);
        if (attacchi.contains(c)) throw new IllegalArgumentException("La coordinata è già stata attaccata");
        attacchi.add(c);
        //posso fare il confronto con equals nella coordinata
        if ()
    }
    
    @Override
    public String toString(){
        return "allalala";
    }

}
