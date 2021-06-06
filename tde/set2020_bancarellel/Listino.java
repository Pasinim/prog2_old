package set2020_bancarellel;
import java.util.Map;
import java.util.HashMap;

public class Listino {
    private Map<Inventario, Integer> prices;

    private Listino(){
        prices = new HashMap<Inventario, Integer>();
    }
}
