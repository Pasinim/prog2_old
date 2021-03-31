import java.util.NoSuchElementException;
import java.util.Iterator;


public class intRangeIterator implements Iterator<Integer>, Iterable<Integer>{
    //metto Iterabe cosi posso iterare con for each
    private final int stop, step;
    private int val;

    public intRangeIterator(int start, int stop, int step){
        this.stop=stop;
        this.step=step;
        val=start;
    }
        public int idx;

        @Override
        public boolean hasNext(){
            return val < stop;
        }
        
        @Override 
        public Integer next(){
            if (!hasNext()) throw new NoSuchElementException();
            int ret=val;
            val+=step;
            return ret;
        }
        public Iterator<Integer> iterator(){
            return new Iterator<Integer>();
        }
        public static void main(String[] args) {
            for (int x : new intRangeIterator(0, 10, 2)) System.out.println(x);
        }
    
}