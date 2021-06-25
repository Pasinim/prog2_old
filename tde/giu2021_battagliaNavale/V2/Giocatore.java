package giu2021_battagliaNavale.V2;
import java.util.*;

public class Giocatore {
    public final GrigliaFlotta flotta;
    private GrigliaStrategica strategica;

    public Giocatore(){
        flotta = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
    }
    /**
     * Inserisce il Set n di navi all'interno della griglia flotta
     */
    public Giocatore(Set<Nave> n){
        flotta = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
        Iterator<Nave> it = n.iterator();
        while (it.hasNext())
            flotta.aggiungiNave(it.next());
    }

    public void colpisci(Coordinata c, GrigliaFlotta avversario){
        if (avversario.isHit(c))
            if (avversario.getNave(c).getAffondata())
                strategica.updateValore(c, '#');
            else 
                strategica.updateValore(c, '*');
        else
            strategica.updateValore(c, '.');

    }

    /**
     * restituisce la griglia della flotta, per forire all'avversario la griglia da colpiure
    */
    public GrigliaFlotta getGrigliaFlotta(){
        return flotta;
    }

    @Override
    public String toString(){
        String str = flotta.toString();
        //str += strategica.toString();
        return str;
    }
}
