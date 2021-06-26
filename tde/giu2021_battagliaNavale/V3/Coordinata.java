package giu2021_battagliaNavale.V3;

/**
 * La classe è immutabile, quindi è lecito dichiarare r e c come pubblici
 * AF(r, c) = (char)(this.c + 'A') + (this.r);
 * RI:  r < 10 && r >= 0  && c < 10  && c >= 0;
 * 
 */

public class Coordinata {
    public final int r;
    public final int c;

    public Coordinata(int x, int y){
        assert repOK();
        r = x;
        c = y;
    }

    private boolean repOK(){
        return (r < 10 
                && r >= 0 
                && c < 10 
                && c >= 0);
    }

    @Override
    public String toString(){
        return "" + (char)(this.c + 'A') + (this.r);
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Coordinata)) return false;
        Coordinata o = (Coordinata) obj;
        if (this.r != o.r) return false;
        if (this.c != o.c) return false;
        return true;
    }


    public static void main(String[] args) {}

}
