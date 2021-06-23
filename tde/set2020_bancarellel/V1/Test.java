package set2020_bancarellel;
import java.util.Map;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Inventario x = new Inventario();
        Prezzi px = new Prezzi(x);
        Inventario iyy = new Inventario();
        x.aggiungi("cane", "gomma");
        x.aggiungi("papera", "gomma");
        x.aggiungi("cane", "gomma");
        x.aggiungi("cane", "gomma");
        px.setPrice("cane", "gomma", 10);
        px.setPrice("papera", "gomma", 2);
        System.out.println(x.toString());
        // x.rimuovi(new Giocattolo ("cane", "gomma"));
        // x.rimuovi(new Giocattolo ("papera", "gomma"));
        // x.rimuovi(new Giocattolo ("cane", "gomma"));
        System.out.println(px.toString());
    
        iyy.aggiungi("cane", "gomma");
        iyy.aggiungi("cane", "gomma");

        

        // System.out.println(x.hashCode());
        // System.out.println(iyy.hashCode());  
        // System.out.println(px.toString());  
    }

}
