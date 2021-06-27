package gen2021_pianeti.Top_down;

import java.util.*;

/**
 * Le istanze di questa classe rappresentano un punto tridimensionale nello spazio.
 * Le istanze di questa classe sono immutabili.
 * AF(x, y, z) -> (x, y, z)
 * IR sempre rispettato, qualsiasi valore è corretto.
 */

public class Punto {
   public final int x;
   public final int y;
   public final int z; 

   /**
    * EFFECTS: inizializza un nuovo punto di coordinate (x, y, z)
    * @param x 
    */
   public Punto(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
   }

   /**
    * EFFECTS: restituisce un nuovo punto ottenuto sommando le coordinate di this con p
    * Solleva una eccezione di tipo NullPointerException se p è null
    * @param p punto da sommare
    * @return this + p
    */
   public Punto somma(Punto p){
        Objects.requireNonNull(p);
       return new Punto(p.x + this.x, p.y + this.y, p.z + this.z);
   }

    /**
    * EFFECTS: restituisce un nuovo punto ottenuto sottraendo le coordinate di this con quelle di p
    * Solleva una eccezione di tipo NullPointerException se p è null
    * @param p punto da sottrarre
    * @return this - p
    */
   public Punto sottrai(Punto p){
        Objects.requireNonNull(p);
        return new Punto(this.x - p.x, this.y - p.y, this.z - p.z);
    }

    /**
     * Restituisce la somma dei valori assoluti delle coordinate del punto.
     * @return somma dei valori assoluti
     */
    public int norma(){
        return Math.abs(x) + Math.abs(y) + Math.abs(y);
    }

    @Override 
    public String toString(){
        return String.format("(%d, %d, %d)", x, y, z); 
    }
}
