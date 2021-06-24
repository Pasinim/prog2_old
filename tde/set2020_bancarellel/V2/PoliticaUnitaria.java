package set2020_bancarellel.V2;
import java.util.*;

public class PoliticaUnitaria implements Listino {
    private Map<Giocattolo, Integer> listino;

    public PoliticaUnitaria(){
        listino = new HashMap<Giocattolo, Integer>();
    }

    

    /**
     * Aggiorna il prezzo del giocattolo g nel listino.
     * @param g Giocattolo
     * @param prezzo Prezzo unitario di g
     */
    @Override
    public void aggiornaPrezzi(Giocattolo g, int prezzo){
        Objects.requireNonNull(g);
        listino.put(g, prezzo);
    }


    /**
     * Se g è null solleva una ecezione di tipo NullPointerException
     * Se quantità è minore solleva
     * una eccezione di tipo IllegalArgumentException.
     * Se la quantità supera quella presente nell'inventario solleva una eccezione
     */
    @Override
    public int prezzoTotale(Giocattolo g, int quantita) {
        Objects.requireNonNull(g);
        if (quantita < 1) 
            throw new IllegalArgumentException("La quanttià non può essere negativa");
        return (listino.get(g) * quantita);
    }

    @Override
    public String toString(){
        String str = "";
        for (Map.Entry<Giocattolo, Integer> entries : listino.entrySet())
            str += entries.getValue();
        return str;
    }

    @Override 
    public int hashCode(){
        int res = 0; 
        for (Map.Entry<Giocattolo, Integer> entries : listino.entrySet()) {
            res = 37 * res + Integer.hashCode(entries.getKey().hashCode());
            res = 37 * res + Integer.hashCode(entries.getValue().hashCode());
        }
        return res;
    }

    @Override
    public int size() {
        return listino.size();
    }
    
}
