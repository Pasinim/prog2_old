package giu2021_battagliaNavale.Top_down;
import java.util.*;

/**
 * Le istanze di questa classe rappresenta un giocatore, dotato di una griglia in cui sono disposte le propire navi e
 * una griglia Strategica in cui può riportare i danni e le posizione dei colpi sulla flotta avversaria.
 * Le istanze sono immutabili
 */
public class Giocatore {
    //è una cosa intelligente esporre la rappresentazione così? Dall'esterno posso aggiungere navi o operare sulla strategica
    public final GrigliaFlotta myFlotta;
    public final GrigliaStrategica myStrategica;

    public Giocatore(GrigliaFlotta f, GrigliaStrategica s){
        myFlotta = f;
        myStrategica = s;
    }
    /**
     * Data una coordinata e la flotta dell'avversario aggiorna la griglia strategica di conseguenza.
     * Il colpo mancato è indicato con .
     * Il colpo che ha causato l'affondamento è indicato con #
     * Il colpo che ha colpito una nave è indicato con *
     * @param c Coordintata da colpire 
     * @param avversario Flotta dell'avversario su cui effettuare l'attacco
     */

     //FINISICI< DEVI METTERE # QUANDO AFFONDA
    public void colpisci(Posizione c, GrigliaFlotta avversario){    
        if (avversario.isHit(c)){
            if (avversario.getNave(c).isAffondata())
                myStrategica.updateValore(c, '#');
            myStrategica.updateValore(c, '*');
        }
        else 
            myStrategica.updateValore(c, '.');
    }

    public static void main(String[] args) {
    }
}
