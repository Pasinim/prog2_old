package set2020_bancarellel.V2;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano un inventario
 */

public class Inventario {
    private Map<Giocattolo, Integer> inventario;

    public Inventario(){
        inventario = new HashMap<Giocattolo, Integer>();
    }

    /**
     * Aggiunge il giocattolo g all'inventario. Se il giocattolo è già presente nell'inventario 
     * viene incrementata la quantità.
     * Se g è null solleva una eccezione
     * @param g Giocattolo da inserire nell'inventario
     */
    public void aggiungi(Giocattolo g){
        Objects.requireNonNull(g);
        if (inventario.containsKey(g))
            inventario.put(g, inventario.get(g) + 1);
        else
            inventario.put(g, 1);
    }

    @Override
    public String toString(){
        String str = "";
        for (Giocattolo g : inventario)
        return str;
    }

    /**
     * Ritorna Iteratore che permette di iterare su tutti i Giocattoli presenti in this.
     * 
     * @return Iteratore
     */
    public Iterator<Giocattolo> giocattoli(){
        return new giocattoliGenerator(inventario);
    }


    private class giocattoliGenerator implements Iterator<Giocattolo>{

        private int count = 0;
        @Override
        public boolean hasNext(){
            return (count < inventario.size());
        }

       @Override
        public Giocattolo next(){
            return inventario.get
        }        
    }
}
