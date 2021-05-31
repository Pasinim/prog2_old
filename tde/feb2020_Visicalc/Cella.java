package tde.feb2020_Visicalc;
/**
 * Overview: Le istanze di questa classe rappresentano celle di un foglio di calcolo. 
 * Le istanze sono mutabili.
 */

public abstract class Cella {
    
    private int riga;
    private char colonna;
    private int[][] posizione; //MAPPA?????? Non ha senso fare una matrice se è solo testuale
    protected int value;

    //COSTRUTTORI
    /**
     * Inizializza una nuova cella in posizone [r][c] nel foglio di calcolo con il valore value
     * 
     * @param c Lettera della colonna
     * @param r Numero della riga 
     * @param value Valore da inserire nella cella[r][c]
     */
    public Cella(char c, int r, int value){
        if (c < 'A' || c > 'Z' ) throw new IllegalArgumentException("Le colonne del foglio di calcolo vanno dalla A alla Z. Trovato " + c);
        posizione = new int[100][100];
        this.riga = r;
        this.colonna = c;  
        int cPos = this.colonna - 'A' + 1;
        this.value = value;
        this.posizione[this.riga][cPos] = value;
    }

    public String getNome(){
        return this.toString();
    }
    public int contenuto(){
        return this.value;
    } 

    @Override 
    public String toString(){
        String str = "";
        str += this.colonna;
        str += this.riga;
        str += " = ";
        str += this.contenuto();
        return str;
    }
}
