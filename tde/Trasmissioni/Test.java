package Trasmissioni;

import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Betaorario a = new Betaorario(29, 79);
        Betaorario b = new Betaorario(29, 78);
        Betaorario d = new Betaorario(29, 8);
        List<Betaorario> l = new ArrayList<Betaorario>();
        l.add(a);
        l.add(b);
        l.add(d);
       // Betaorario c = a.addBetaorario(b);
        //System.out.println(c.toString());
        //System.out.println(a.compareTo(b));
        System.out.println(a.addDurata(2).toString());
        l.sort(null);
        System.out.println(l.toString());
    }
}
