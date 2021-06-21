package giu2021_battagliaNavale;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        List<Nave> n = new ArrayList<Nave>();
        Coordinata c = new Coordinata ('A', 0);
        Nave x = new Nave(Tipo.P, 'V', c );
        n.add(x);
        x.incrementaDanno(new Coordinata('B', 0));
        Griglia g = new GrigliaFlotta(n);
        System.out.println(g.toString());
        //System.out.println(n.toString());

    }
}
