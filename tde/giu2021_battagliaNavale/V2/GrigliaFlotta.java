package giu2021_battagliaNavale.V2;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano la griglia della flotta di un giocatore
 */

public class GrigliaFlotta {
    private Coordinata[][] flotta;
    private List<Nave> navi;
    public GrigliaFlotta(){
        this.flotta = new Coordinata[10][10];
        this.navi = new ArrayList<Nave>();
    }

    public char getValore(Coordinata c){
        return flotta[c.x][c.y].getValore();
    } 

    public boolean isHit(Coordinata c){
        if (this.getValore(c) != '~') return true;
        return false;
    }

}
