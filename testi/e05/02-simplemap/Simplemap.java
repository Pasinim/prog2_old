import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;

//OVERVIEW: Le istanze di questa rappresentano
//          una mappa da stringhe a interi. Gli oggetti di quest classe
//          non mutabili. 
//          Una tipica mappa è {k_1 : v_1, ..., k_n : v_n, } dove n è la dimnsione della mappa
//          {k_1 : v_1, ..., k_n : v_n} sono chiavi uniche, k_i != k_j se i!=j
//          ad ogni chiave è associato un solo valore 
// 
//          A seguito di un inserimento della k->, la nuova mappa sarà:
//          {k_1 : v_1, ..., k_n : v_n, k : v} se k!=k_i per i=1...,n oppure
//          {k_1 : v_1, ..., ..., k_j: v, k_n : v_n} se esiste j t.c. k_j = k
public class Simplemap {
    //ATTRIBUTI
    private List<String> keys;
    private List<String> values;
    /**
     * ABS FUN: AF(keys, values) =  {k_i, v_i | i=1, 2, ..., keys.size(), k_i=keys[i] e v_i = values[i]}
     * REP INV: keys e values non null 
     *          keys e values non contengono valori null
     *          keys non contiene valori duplicati
     *          keys.size()=values.size()
     * ABS INV: le chiavi all'interno di simplemap sono uniche
     *          a ogni chiave è associato un solo valore
     *          il numero di elementi k->v è maggiore o uguale a zero
     */

    //COSTRUTTORI
    /**
     * Post: Istanzia this affinchè rappresenti la mappa vuota
     */
    public Simplemap (){
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    //METODI
    /**
     * Effetti collaterali: aggiorna this
     * Post condizioni:     aggiorna la mappa ed aggiunge l'assoiazione k->v se k non è presente
     *                      altrimenti aggiorna il valore associato a k
     *                      Solleva un nullPointerException se k==null
     */
    public void put (String k, int v) {
        Objects.requireNonNull(k);
        keys.add(k);
        values.add(k);
    }

    /**
     * Effetti collaterali: aggiorna this
     * Post condizioni:     aggiorna la mappa e rimuove l'assoiazione k->v se k è presente
     */
    public void remove (String k) {
        if (!containsKey(k)) return;
        
    }

    /**
     * Post condizioni:     restituisce il valore associato a k, se k è presente nella mappa
     *                      altrimenti solleva un'eccezione di tipo {@link java.util.NoSuchElementException}
     */
    public int get(String k) {
        if (keys.indexOf(k) > 0) return keys.indexOf(k);
        return keys.indexOf(k);
        //else throw new NoSuchElementException();
    }

    //Post: restituisce il numero di associazioni presenti in this
    public int size(){
        return keys.size();
    };
     
    //Post: restitiusice true se la stringa k è presente in this, false altrimenti 
    public boolean containsKey(String k){
        return keys.contains(k);
    }


    public boolean RepOK(){
        return true;
    }

    @Override
    public String toString(){
        return "";
    }

    @Override
    public boolean equals(Object o){
        return true;
    }
    @Override
    public int hashCode(){
        return 0;
    }
}
