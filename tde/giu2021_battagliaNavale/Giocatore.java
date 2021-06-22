package giu2021_battagliaNavale;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano un giocatore, che possiede
 * una griglia strategica nel quale tiene traccia dei suoi attacchi
 * e una griglia della propria flotta, che invece viene aggiornata nel caso in 
 * cui l'avversario colpisca o affondi una nave.
 */
public class Giocatore {
    private GrigliaFlotta flotta;
    private GrigliaStrategica strategica;

    public Giocatore(){
        flotta = new GrigliaFlotta();
        strategica = new GrigliaStrategica();
    }

    public void popolaFlotta(List<Nave> n){
        for (Nave x : n)
            flotta.addNave(x);
    }

    public void stampaFlotta(){
        flotta.griglia.toString();
    }
}
