import java.lang.Iterable;
import java.util.Iterator;
public class Test_iterator {
    public static void main(String[] args) {
        int[] e = {1, 2, 3, 4, 5, 6};
        Generatore g = new Generatore(e);
        Iterator<Integer> it = g.iterator();
        System.out.println(it.hasNext());
        while (it.hasNext())
            System.out.println(it.next());
        

    }
}
