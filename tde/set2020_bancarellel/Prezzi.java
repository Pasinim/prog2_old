package set2020_bancarellel;

import java.util.*;

/**
 * Le istanze di questa classe rappresentano i prezzi dei giocattoli di un inventario 
 * ABS FUN: AF(inventario, prezzi) -> 
 * INV REP: inventario.size() == prezzi.size()
 */

public class Prezzi implements Listino {
    private final Inventario inventario; //ha senso mettere l'inventario?
    private Map<Giocattolo, Integer> prezzi;

    public Prezzi(Inventario i){
        this.inventario = i;
        prezzi = new HashMap<Giocattolo, Integer>(); 
    }

    public int size(){
        return prezzi.size();
    }

    /**
     * EFFECTS: setta il prezzo unitario p per il giocattolo g nell'inventario this. Se g è già presente nel listino
     * aggiorna il prezzo.
     * Solleva una eccezione se nell'inventario non è presente il giocattolo g
     * @param g Giocattolo  
     * @param p Prezzo per il giocattolo g
     */
    @Override
    public void setPrice(String nome, String materiale, int p){
        Giocattolo g = new Giocattolo(nome, materiale);
        if (!this.inventario.contains(g)) throw new NoSuchElementException(
            "Impossibile settare il prezzo di " + g.toString() + ". Non è presente nell'inventario");
       
         // se g è  già presente come aggiorno il suo valore? aumento il prezzo totale
        prezzi.put(g, p);
    }
       
    /**
     * EFFECTS: restituisce il prezzo unitario del giocattolo g. Se g non è presente in this.prezzi solelva
     * una eccezione
     * @param g Giocattolo g
     * @return Prezzo di g
     */
    public int getPrezzoUnitario(Giocattolo g){
        if (!prezzi.containsKey(g)) throw new NoSuchElementException(
            "Impossibile restituire il prezzo unitario di " + g.toString() + ". Non è presente nel lisino prezzi");
        return prezzi.get(g);
    }

    /**
     * EFFECTS: resistuisce il prezzo totale del giocattolo g in this.inventario 
     * @param g Giocattolo
     * @return prezzo cumulato dei gioattoli g
     */
    public int getPrezzoTotale(Giocattolo g){
        if (!prezzi.containsKey(g)) throw new NoSuchElementException(
            "Impossibile restituire il prezzo di " + g.toString() + ". Non è presente nel lisino prezzi");
        return prezzi.get(g) * inventario.getQuantita(g);
    }

    protected boolean repOK(){
        return (inventario != null 
                && prezzi != null
                && inventario.size() == prezzi.size());
    }

    @Override
    public String toString(){
        String str = "";
        for (Map.Entry<Giocattolo, Integer> entry : prezzi.entrySet())
            str =  str + inventario.getQuantita(entry.getKey()) + " " + entry.getKey() + " " + getPrezzoTotale(entry.getKey()) + "\n";
        return str;
    }

    public boolean equals(){
        return true;
    }

    @Override
    public int hashCode(){
        return 1;
    }

}
