package gen2021_pianeti.Top_down;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        final Punto p = new Punto (1, 2, 3);
        Punto x = new Punto (1, 1, 1);
        p = p.somma(x);
        System.out.println(p.toString());
    }
}
