package giu2021_battagliaNavale.V2;
import java.util.*;

public class Giocatore {
    public final GrigliaFlotta flotta;
    private GrigliaStrategica strategica;

    public Giocatore(){
        flotta = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
    }

    public Giocatore(Set<Nave> n){
        flotta = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
        Iterator<Nave> it = n.iterator();
        while (it.hasNext())
            flotta.aggiungiNave(it.next());
    }

    @Override
    public String toString(){
        String str = flotta.toString();
        str += strategica.toString();
        return str;
    }
}
