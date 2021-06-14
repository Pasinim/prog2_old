import java.util.Iterator;
public class Test_iterator {
    public static void main(String[] args) {
        static class Generatore implements Iterable<Integer>{
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
        int[] e = {1, 2, 3, 4, 5, 6};
        Generatore g = new Generatore(e);
        Iterator<Integer> it = g.iterator();
        System.out.println(it.hasNext());
        while (it.hasNext())
            System.out.println(it.next());
        

    }
}
