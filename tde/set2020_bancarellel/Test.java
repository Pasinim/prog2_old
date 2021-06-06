package set2020_bancarellel;
import java.util.Map;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Inventario ixx = new Inventario();
        ixx.put("cane", "gomma", 2);
        ixx.put("papera", "gomma", 22);
        System.out.println(ixx.toString());  
    }

}
