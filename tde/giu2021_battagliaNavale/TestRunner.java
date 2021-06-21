package giu2021_battagliaNavale;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        List<Nave> n = new ArrayList<Nave>();
        Coordinata c = new Coordinata ('A', 0);
        Nave x = new Nave(Tipo.P, 'V', c );
        n.add(x);
        x.incrementaDanno(new Coordinata('B', 0));
        Griglia f = new GrigliaFlotta(n);
        //il tipo apparente di s è griglia quindi sto eseguendo il 
        //metodo di una sottoclasse su una superclasse
        Griglia s = new GrigliaStrategica();
        ()
        s.nuovoAttacco(c);
        System.out.println(f.toString());
        //System.out.println(n.toString());

    }
}
