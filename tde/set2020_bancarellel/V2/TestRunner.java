package set2020_bancarellel.V2;

public class TestRunner {
    public static void main(String[] args) {
        Inventario i = new Inventario();  
        i.aggiungi(new Giocattolo("cane", "gomma"));
        i.aggiungi(new Giocattolo("cane", "pezza"));
        i.aggiungi(new Giocattolo("cane", "gomma"));
        System.out.println(i.toString());
    }
}
