package giu2021_battagliaNavale;

import java.util.Objects;

/**
 * Le istanze di questa classe rappresentano una coordinata di posizione (x,y).
 * Ad ogni coordinata è associato un char
 * AF: (x, y) -> (char)(this.x + 'A') + this.y;
 * RI:  this.x < 10
 *      this.x > 0
 *      this.y < 10
 *      this.y > 0  
 *      this.valore = '*'
 *      this.valore = '#'
 *      this.valore = '.'
 *      this.valore = '~'
 *      this.valore = 'P'
 *      this.valore = 'C'
 *      this.valore = 'F'
 *      this.valore = 'S'
 */

public class Coordinata {
    
    public final int x;
    public final int y;
    private char valore;

    /**
     * Inizializza una coordinata (x, y) contenente '~'
     * @param x Ascissa 
     * @param y Ordinata
     */
    public Coordinata(int x, int y){
        if (x > 10 || x < 0) 
            throw new IllegalArgumentException("Ascissa non valida, trovato " + x);
        if (y > 10 || y < 0) 
            throw new IllegalArgumentException("Ascissa non valida, trovato " + y);
        this.x = x - 'A';
        this.y = y;
        this.valore = '~';
    }

    /**
     * Modifica il valore della coodinata this in c
     * @param c Nuovo valore
     */
    public void updateValore(char c){
        this.valore = c;
        if (!repOK()) 
            throw new IllegalArgumentException("IR non rispettato");   
    }

    public char getValore(){
        return this.valore;
    }

    @Override
    public String toString(){
        return "" + (char)(this.x + 'A') + this.y;
    }

    /**
     *  SE NON SOVRASCRIVO EQUALS LA MODIFICA IN NAVE.INCREMENTADANNO
     *  NON FUNZIONE
     */
    @Override
    public boolean equals(Object obj){
        Objects.requireNonNull(obj);
        if (!(obj instanceof Coordinata)) return false;
        Coordinata o = (Coordinata) obj;
        if (this.x != o.x) return false;
        if (this.y != o.y) return false;
        if (this.valore != o.valore) return false;
        return true;
    }

    private boolean repOK(){
        return (
          this.x < 10 &&
          this.x >= 0 &&
          this.y < 10 &&
          this.y >= 0 && (
              this.valore == '*' ||
              this.valore == '#' ||
              this.valore == '.' ||
              this.valore == 'P' ||
              this.valore == 'C' ||
              this.valore == 'S' ||
              this.valore == 'F' ||
              this.valore == '~') 
          );
    }

}
