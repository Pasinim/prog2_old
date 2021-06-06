
import java.util.NoSuchElementException;
import java.lang.Iterable;
import java.util.Iterator;
/**
 * Iterable è una rappresentazione di elementi su cui è possibile iterare
 * Iterable ha un metodo che produce un Iterator (cioè un generatore per la Liskov)
 * Iterator ha i metodi hasNext e next
 */

public class Generatore implements Iterable<Integer>{
    private int[] els;
    public Generatore (int[] a){
        this.els = a;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() { //cosa è questo??
            private int n = 0;

            @Override
            public boolean hasNext(){
                return n <= els.length;
            }

            @Override
            public Integer next(){
                if (!hasNext()) throw new NoSuchElementException();
                Integer ret = els[n];
                n++;
                return ret; 
            }
        };
    }
}
