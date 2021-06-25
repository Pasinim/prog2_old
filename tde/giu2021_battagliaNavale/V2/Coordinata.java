package giu2021_battagliaNavale.V2;

/**
 * La classe è immutabile, quindi basta controllare x e y nel costruttore
 */

public class Coordinata {
    public final int r;
    public final int c;

    public Coordinata(int x, int y){
        if (!(x < 10 && x >= 0 && y < 10 && y >= 0))
            throw new IllegalArgumentException("Coordinata non valida"); 
        r = x;
        c = y;
    }
}
