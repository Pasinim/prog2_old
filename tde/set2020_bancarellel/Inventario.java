package set2020_bancarellel;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.HashMap;
/**
 * OVERVIEW: Questa classe rappresenta l'inventario di una bancarelle.
 * La classe è mutabile
 * ABS FUN: AF(Map) -> (items[i] : quantity[i])
 * INV REP: items != null
 *
 */

public class Inventario {
    private Map <Giocattolo, Integer> items;

    public Inventario(){
        items = new HashMap <Giocattolo, Integer>();
    }

    /**
     * 
     */
    // public Integer getQuantita(int idx){
    //     if (!(items.containsKey(key))) throw new NoSuchElementException("
    //         Il giocattolo inserito non è presente nell'inventario");
    //     return items.get(key);
    // } 



    
    public void put(String nome, String materiale, Integer quantita){
        Giocattolo g = new Giocattolo(nome, materiale);
        items.put(g, quantita);
    }

    @Override
    public String toString(){
        String str = "";
        for (Map.Entry<Giocattolo, Integer> entry : items.entrySet()) {
            // /str = str +  entry.getValue();
            str += "\n";
            // /str += entry.toString();
            str += "\n";
        }
        return str;
    }
    
}
