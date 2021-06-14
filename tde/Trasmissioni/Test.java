package Trasmissioni;

public class Test {
    public static void main(String[] args) {
        Betaorario a = new Betaorario(29, 79);
        Betaorario b = new Betaorario(29, 79);
        Betaorario c = a.addBetaorario(b);
        System.out.println(c.toString());
        System.out.println(a.compareTo(b));
    }
}
