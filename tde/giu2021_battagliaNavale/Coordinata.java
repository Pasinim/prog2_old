public class Coordinata {
    
    public final int x;
    public final int y;
    private char valore;

    /**
     * Inizializza una coordinata (x, y) contenente '~'
     * @param x
     * @param y
     */
    public Coordinata(char x, int y){
        if ((x > 'J' || x < 'A') || (y < 0 || y > 9)) throw new IllegalArgumentException();
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
    }

    public char getValore(){
        return this.valore;
    }

    @Override
    public String toString(){
        return "" + (char)(this.x + 'A') + this.y;
    }

}
