package Giu2020_Teramini.testo;
/**
 * Le istanze di questa classe rappresentano una coordinata nello spazio
 * Le istanze di questa classe sono immutabili
 * 
 * AF(x, y) -> "< " + x + ", " + y + ">";
 * ABS INV: /
 */

public class Coordinata {
    private final int x;
    private final int y;
    
    /**
     * Inizializza una nuova coordinata
     * @param x ascissa del punto
     * @param y ordinata del punto
     */
    public Coordinata(int x, int y){
        this.x = x;
        this.y = y;
    }

    //EFFECTS: restituisce this.x
    public int getX(){
        return this.x;
    }

    //EFFECTS: restituisce this.y
    public int getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "< " + this.x + ", " + this.y + ">";
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + Integer.hashCode(this.x);
        result = 31 * result + Integer.hashCode(this.y);
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Coordinata)) return false;
        Coordinata other = (Coordinata) obj;
        if (other.getX() != this.getX() || other.getY() != this.getY()) return false;
        return true; 
    }
}
