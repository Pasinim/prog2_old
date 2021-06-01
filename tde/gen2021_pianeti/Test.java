package tde.gen2021_pianeti;

public class Test {
    public static void main(String[] args) {
        Punto p = new Punto (1, -1, 4);
        Punto s = new Punto (2, -2, 3);
        Pianeta a = new Pianeta("Pippo", p);
        Pianeta b = new Pianeta ("Pippo", s);
        Pianeta c = new Pianeta("Pippo", p);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));


    }
}
