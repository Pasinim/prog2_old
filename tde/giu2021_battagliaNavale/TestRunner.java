package giu2021_battagliaNavale;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        List<Nave> n = new ArrayList<Nave>();
        Coordinata c = new Coordinata ('B', 0);
        Coordinata c2 = new Coordinata ('B', 2);
        Coordinata c3 = new Coordinata ('A', 7);
        Nave x2 = new Nave(Tipo.C, 'O',  c2);
        System.out.println("\tAggiunto x2");

        Nave x = new Nave(Tipo.P, 'V',  c);
        System.out.println("\tAggiunto x");

        Nave x3 = new Nave(Tipo.F, 'V',  c3);
        n.add(x);
        n.add(x2);
        n.add(x3);

        // x.incrementaDanno(new Coordinata('B', 0));
        // Griglia f = new GrigliaFlotta(n);
        // //il tipo apparente di s è griglia quindi sto eseguendo il 
        // //metodo di una sottoclasse su una superclasse
        // Griglia s = new GrigliaStrategica();
        // s.hit(c);
        // System.out.println(f.toString());
        // //System.out.println(n.toString());

        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        g1.popolaFlotta(n);
        g1.stampaFlotta();


    }
}
