package Giu2020_Teramini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
/**
 * OVERVIEW: Le istanze di questa classe rappresentano un rettangolo che racchiude un tetramino (Boundingbox). 
 * Un rettangolo può essere rappresentato dalle coordinate dei suoi vertici, rispettivamente in basso a sinistra e in alto a destra.
 * 
 * Le istanze di questa classe sono immutabili.
 * ABS FUN: AF(dx, sx) -> <(x1, y1), (x2, y2)> dove x1 e y1 sono l'ordinata e l'ascissa minore, e x2 e y2 quelle maggiori 
 * REP INV: dx, sx != null
 */
 public class Rettangolo {
    //Posso mettere public dato che è final, espongo la rappresentazione ma tanto non è possibile modificare il valore
    public final Coordinata dx;
    public final Coordinata sx;

    /**
     * Iniizalizza un rettangolo.
     * Se coord null solleva una eccezione
     * @param coord Lista di coordinate del teramino
     */
    public Rettangolo(Set<Coordinata> coord){
        if (coord == null ) throw new NullPointerException();
        List<Integer> ascisse = new ArrayList<Integer>();
        for (Coordinata c : coord){
            ascisse.add(c.getX());
        }

        List<Integer> ordinate = new ArrayList<Integer>();
        for (Coordinata c : coord){
            ascisse.add(c.getY());
        }
        //sort esegue l'ordinamento basandosi sul comparatore passato come argomento.
        // Se il passo null allora l'ordinamento è quello naturale
        ascisse.sort(null);
        ordinate.sort(null);
        this.sx = new Coordinata (ascisse.get(0), ordinate.get(0));
        this.dx = new Coordinata (ascisse.get(ascisse.size() - 1), ordinate.get(ordinate.size() - 1));
    }

    private boolean repOK(){
        return (dx != null
                && sx != null);
    }

    @Override
    public String toString(){
        return "[ " + sx.toString() + " " + dx.toString() + " ]";
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(this.dx.hashCode());
        result = 37 * result + Integer.hashCode(this.sx.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Rettangolo)) return false;
        Rettangolo other = (Rettangolo) obj;
        if (this.dx != other.dx || this.sx != other.sx) return false;
        return true;
    }



    
}
