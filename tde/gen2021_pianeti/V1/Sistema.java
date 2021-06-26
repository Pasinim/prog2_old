package tde.gen2021_pianeti;
import java.util.ArrayList;
import java.util.List;
/**
 * Le istanze di questa classe rappresentano un Sistema Astronomico in cui i Corpi celesti in esso
 * presente possono influenzarsi reciprocamente
 */

public class Sistema {
    private List<Pianeta> pianeti;
    private List<Stella> stelle;
    private int tempo;
    private long energia_tot;

    /**
     * Inizializza un nuovo sistema con una lista vuota di corpi celesti e la durata della simulazione
     * @param tempo Durata della simulazione
     */
    public Sistema (int tempo){
        pianeti = new ArrayList<Pianeta>();
        stelle = new ArrayList<Stella>();
        this.tempo = tempo;
    }

    /**
     * Aggiunge un corpo al sistema astronomico
     * @param c Corpo da aggiungere al sistema
     */
    public void addPianeta(Pianeta p){
        pianeti.add(p);
    }

    
}
