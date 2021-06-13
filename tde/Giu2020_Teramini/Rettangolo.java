package Giu2020_Teramini;
import java.util.Iterator;
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
    public Rettangolo(NavigableSet<Coordinata> coord){
        if (coord == null ) throw new  NullPointerException();
        int maxX = Integer.MAX_VALUE;
        int minX = Integer.MIN_VALUE;
        int maxY = Integer.MAX_VALUE;
        int minY = Integer.MIN_VALUE;
        Iterator<Coordinata> it = coord.iterator();
        //scorro la lista per trovare l'estremo sx e quello dx, devo fare con iteratore
        while (it.hasNext()){
            Coordinata curr = it.next();
            //voglio fare un comparatore tra Coordinatae 
        }
        for (int i = 1; i < coord.size(); i++){
            if (coord.get(i).getX() >= maxX) maxX = coord.get(i).getX();
            if (coord.get(i).getX() <= minX) minX = coord.get(i).getX();
            if (coord.get(i).getY() >= maxY) maxY = coord.get(i).getY();
            if (coord.get(i).getY() <= minY) minY = coord.get(i).getY();
        }
        this.sx = new Coordinata(minX, minY);
        this.dx = new Coordinata(maxX, maxY);
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
