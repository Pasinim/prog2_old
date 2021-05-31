package tde.feb2020_Visicalc.Visicalc_mappa;

import java.util.HashMap;
import java.util.Map;
public class Foglio {
    private Map<Coord, Cella> foglio;
    private final int righe;

    public Foglio(int r)    {
        this.righe = r;
        HashMap foglio = new HashMap(this.righe);
    }

    public addCella (Coord coo, Cella c){
        foglio.put(coo, c);
    }
    
}
