package giu2021_battagliaNavale.Top_down;
/**
 * Le istanze di questa classe rappresentano una posizione in una 
 * griglia, identificata da una riga e da una colonna.
 * Le istanze di questa classe sono immutabili
 */

public class Posizione {
    public final int r;
    public final int c;

    public Posizione(int c, int r){
        if ((r > 9 || r < 0) || (c > 9 || c < 0))
            throw new IllegalArgumentException();
        this.r = r;
        this.c = c;
    }

    /**
     * Restituisce una nuova posizione ottenuta incrementando 
     * la riga di this
     * @return Posizione[r+i][c]
     */
    public Posizione incrementaRiga(int i){
        return new Posizione(this.c, this.r + i);
    }

    /**
     * Restituisce una nuova posizione ottenuta incrementando 
     * la colonna di this
     * @return Posizione[r][c+i]
     */
    public Posizione incrementaColonna(int i){
        return new Posizione(this.c + i, this.r);
    }

    @Override
    public String toString(){
        return 
            ("" + (char)(c + 'A') + r );
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Posizione)) return false;
        Posizione o = (Posizione) obj;
        if (this.r != o.r || this.c != o.c) return false;
        return true;
    }

    public static void main(String[] args) {
        Posizione p = new Posizione('F' - 'A' , 3);
        System.out.println(p.toString());
    }
}
