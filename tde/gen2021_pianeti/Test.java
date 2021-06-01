package tde.gen2021_pianeti;

public class Test {
    public static void main(String[] args) {
        Punto p = new Punto (1, -1, 4);
        Punto s = new Punto (2, -2, 3);
        Punto x = p.somma(s);
        System.out.println(x.toString());
        System.out.println(p.norma());
        System.out.println(p.isAscissaMaggiore(s));
        System.out.println(p.isOrdinataMaggiore(s));
        System.out.println(p.isQuotaMaggiore(s));

    }
}
