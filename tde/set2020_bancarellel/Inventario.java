package set2020_bancarellel;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.HashMap;
/**
 * OVERVIEW: Questa classe rappresenta l'inventario di una bancarella.
 * La classe è mutabile
 * ABS FUN: AF(Map) -> Giocattolo[i] : quantità [i]
 * INV REP: items != null
 *          quantità > 0
 *
 */

public class Inventario {
    private Map <Giocattolo, Integer> items;

    /**
     * Inizializza un inventario vuoto
     */
    public Inventario(){
        items = new HashMap <Giocattolo, Integer>();
    }

    /**
     * Restituisce la quantità del giocattolo g presente nell'inventario this. Solleva una eccezione nel caso in cui 
     * il giocattolo non è presente in this
     * @param g Giocattolo
     * @return Quantità di g in this
     */
    public int getQuantita(Giocattolo g){
        if (!items.containsKey(g)) throw new NoSuchElementException("Giocattolo non presente nell'inventario");
        return items.get(g);
    }

    /**
     * EFFECTS: Rimuove un (1) giocattolo dall'inventario.
     * @param g Giocattolo da rimuovere
     */
    public void rimuovi (Giocattolo g){
        if (!items.containsKey(g)) throw new NoSuchElementException();
        int qty = this.getQuantita(g); 
        if (qty > 1){
            items.put(g, qty - 1);
            return;
        }
        items.remove(g);
    }


    /**
     * EFFECTS: aggiunge un nuovo giocattolo (identificato da nome e materiale) in this
     * @param nome Nome del giocattolo
     * @param materiale Materiale del giocattolo
     */
    public void aggiungi(String nome, String materiale){
        Integer qty = 1;
        Giocattolo g = new Giocattolo(nome, materiale);
        if (items.containsKey(g))
            qty = getQuantita(g) + 1;
        items.put(g, qty);
    }
    
    //EFFECTS restituisce true se in this è presente il giocattolo g, false altrimenti
    public boolean contains(Giocattolo g){
        return items.containsKey(g);
    }

    public int size(){
        return items.size();
    }

    private boolean repOK(){
        if (this.items == null) return false;
        for (Map.Entry<Giocattolo, Integer> entry : items.entrySet()){
            if (entry.getValue() < 0) return false;
        }
        return true;
    }

    @Override
    public String toString(){
        String str = "";
        //Map.Entry fornisce una Entry contenente giocattolo e il valore
        for (Map.Entry<Giocattolo, Integer> entry : items.entrySet())
        //come fa getKey a prendere il toString di giocattolo?
            str = str + entry.getValue() + " " + entry.getKey() + "\n"; 
        return str;
    }

    @Override
    public int hashCode(){
        int result = 17;
        for (Map.Entry<Giocattolo, Integer> entry : this.items.entrySet())
            result = 37 * result + Integer.hashCode(entry.getKey().hashCode()) + Integer.hashCode(entry.getValue());
        return result; 
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Inventario)) return false;
        Inventario other = (Inventario) obj;
        if (this.items.size() != other.items.size()) return false;
        //devo tenere conto che potrebbero essere in ordine divero
        for (Map.Entry<Giocattolo, Integer> entry : other.items.entrySet())
            if (!this.items.containsKey(entry.getKey())) return false;
            //devo verificare che anche la quantità sia uguale
        return true;
    }


    
}
