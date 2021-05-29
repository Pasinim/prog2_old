import java.util.HashSet;
import java.util.Set;

public class TestRunner {
    public static void main(String[] args) {
        
        Set<Coordinata> c = new HashSet<Coordinata>();

        c.add(new Coordinata(0, 0));
        c.add(new Coordinata(0, 1));
        c.add(new Coordinata(1, 1));
        c.add(new Coordinata(2, 1));
        
        Teramino t = new TeraminoImpl('X', c);

        System.out.println(t.toString() + "\n");

        t = t.ruota();

        System.out.println(t.toString());

        t = t.ruota();

        System.out.println(t.toString()); //(???) exception
    }
}