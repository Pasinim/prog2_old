package tde.feb2020_Visicalc.Visicalc_mappa;

import java.util.ArrayList;
import java.util.List;

public class Formula extends Contenuto {
    private Operazione op;
    private List<Cella> cells;

    public Formula(Operazione op, Cella c1, Cella c2){
        this.op = op;
        cells = new ArrayList<Cella>();
        cells.add(c1);
        cells.add(c2);
    }
    /**
     * EFFECTS: calcola il valore di this eseguendo l'operazione op tra cells[1] e cells[0] 
     */
    public int getValore(){
        return op.calcola(cells.get(0), cells.get(0));
    }
}
