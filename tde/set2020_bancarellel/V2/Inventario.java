package set2020_bancarellel.V2;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano un inventario
 */

public class Inventario {
    private Map<Giocattolo, Integer> inventario;

    /**
     * Inizializza un nuovo inventario vuoto
     */
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

    /**
     * Rimuove il giocattolo g dall'inventario. Se l'inventario contiene solamente un (1)
     * giocattolo g lo rimuove definitivamente dall'inventario, altrimenti ne decrementa la quantità;
     * @param g Giocattolo da rimuovere
     */
    public void rimuovi(Giocattolo g){
        if (!(this.contains(g))) 
            throw new IllegalArgumentException("Il giocattolo non è nell'inventario");
        Iterator<Giocattolo> it = this.giocattoli();
        Giocattolo curr = it.next();
        while (it.hasNext()){
            curr = it.next();
            if (g.equals(curr))
                break;
        }
        if (getQuantita(curr) > 1)
            inventario.put(g, getQuantita(curr) - 1);
        else 
            inventario.remove(g);
    }

    /**
     * Restituisce true se g è nell'inventario, false altrimenti
     */
    public boolean contains(Giocattolo g){
        Objects.requireNonNull(g);
        return inventario.containsKey(g);
    }

    public int size(){
        return inventario.size();
    }

    public int getQuantita(Giocattolo g){
        Objects.requireNonNull(g);
        if (inventario.containsKey(g))
            return inventario.get(g);
        else 
            return 0;
    }

    @Override
    public int hashCode(){
        int res = 0;
        for (Map.Entry<Giocattolo, Integer> entries : inventario.entrySet()){
            res = 37 * res + Integer.hashCode(entries.getKey().hashCode());
            res = 37 * res + Integer.hashCode(entries.getValue().hashCode());
        }
        return res;
    }

    @Override
    public String toString(){
        String str = "";
        for (Map.Entry<Giocattolo, Integer> entries : inventario.entrySet())
            str = str + entries.getValue() + " " + entries.getKey();
        return str;
    }


    /**
     * Ritorna Iteratore che permette di iterare su tutti i
     * Giocattoli presenti in this.
     * 
     * @return Iteratore
     */
    public Iterator<Giocattolo> giocattoli(){
        return new giocattoliGenerator(inventario);
    }


    /**
     * Iteratore per la classe
     */
    private class giocattoliGenerator implements Iterator<Giocattolo>{

        //creo delle istanze per iterare:
        //Copia dell'inventario esterno
        private Map<Giocattolo, Integer> inventarioInterno;
        //Set per avere un iteratore
        private Set<Map.Entry<Giocattolo, Integer>> entries; 
        //iteratore per iterare il set
        private Iterator<Map.Entry<Giocattolo, Integer>> it;

        public giocattoliGenerator(Map<Giocattolo, Integer> inventario){
            inventarioInterno = new HashMap<>(inventario);
            entries = inventarioInterno.entrySet();
            it = entries.iterator();
        }
        @Override
        public boolean hasNext(){
            return (it.hasNext());
        }

       @Override
        public Giocattolo next(){
            return (it.next().getKey());
        }        
    }

    public static void main(String[] args) {
        Inventario i = new Inventario();
        Giocattolo a = new Giocattolo("cane", "gomma");
        Giocattolo b = new Giocattolo("cane", "pezza");
        Giocattolo c = new Giocattolo("cane", "gomma");

        i.aggiungi(a);
        i.aggiungi(b);
        i.aggiungi(c);
        System.out.println(i.toString());

        i.rimuovi(a);
        System.out.println(i.toString());
        i.rimuovi(a);
        System.out.println(i.toString());
    }
}
