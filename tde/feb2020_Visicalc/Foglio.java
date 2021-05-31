package tde.feb2020_Visicalc;

import java.util.List;
import java.util.ArrayList;
public class Foglio {
    private List<Cella> cells;

    public Foglio(){
        cells = new ArrayList<>();
    }

    public void addCella(Cella c){
        cells.add(c);
    }

    @Override 
    public String toString(){
        String str = "[ ";
        for (Cella c : cells)
            str = str + c.toString() + ", ";
        return str + "]";
    }
}
