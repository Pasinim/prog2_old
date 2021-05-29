import java.util.HashSet;
import java.util.Set;

/*
FUNZIONE ASTRAZIONE:
Rappresentazione di un teramino.

La variabile nome rappresenta il nome del teramino.
L'insieme coords rappresenta l'insieme di coordinate che costrusicono il teramino. Non presenta coordinate duplicate.

Questo tipo di dato è immutabile perchè non ci sono metodi che modificano lo stato.
*/

public class TeraminoImpl implements Teramino {
    /*
    INVARIANTE DI RAPPRESENTAZIONE:
    
    coords non puo essere ne null ne vuoto.    
    */
    private char nome;
    private Set<Coordinata> coords;

    /*
    REQUIRES: c diverso da null e non vuoto.
    MODIFIES: -
    EFFECTS: Se c è null viene lanciato NullPointerException.
             Se c è vuoto viene lanciato IllegalArgumentException.
             n non necessita controlli.
    
             Inizializza questa istanza con un carattere per il nome ed un insieme di coordinate per coords
    */
    public TeraminoImpl(final char n, final Set<Coordinata> c){
        if(c == null) throw new NullPointerException("l'insieme di coordinate non può essere null");
        if(c.size() == 0) throw new IllegalArgumentException("l'insieme di coordinate non puo essere vuoto");
        this.coords = c;
        this.nome = n;
        
    }

    @Override
    public char nome() {
        
        return this.nome;
    }

    @Override
    public Set<Coordinata> coordinate() {
        
        return this.coords;
    }

    /*
    REQUIRES: -
    MODIFIES: -
    EFFECTS: Ritorna un nuovo teramino con le celle ruotate di 90 gradi a destra
    */
    @Override
    public Teramino ruota() {
        Set<Coordinata> newset = new HashSet<Coordinata>();

        for (Coordinata c : coords) {
            newset.add(new Coordinata(c.y, -c.x));
        }
        return new TeraminoImpl(nome(), newset);
    }

    @Override
    public Rettangolo boundingBox() {
        
        return Rettangolo.getBoundingBox(coords);
    }

    /*
    REQUIRES: -
    MODIFIES: -
    EFFECTS: Stampa in output il teramino.

             1) Crea una boundingbox di questo teramino
             2) Crea una matrice che ha le stesse dimensioni della boundingbox
             3) Inizializza ogni cella della matrice con '.'
             4) Riempie ogni cella corrispondente alle coordinate di questo teramino con '#'
             5) Nella stringa di output ogni riga del rettangolo viene separata da '\n'
    */
    @Override
    public String toString(){
        Rettangolo r = boundingBox();

        int dimy = r.tr.x - r.bl.x + 1;
        int dimx = r.tr.y - r.bl.y + 1;

        char[][] sketch = new char[dimx][dimy];
        
        for(int i = 0; i < dimx; i++){
            for(int j = 0;j < dimy; j++){
                sketch[i][j] = '.';
            }
        }
        
        //le coordinate vengono 'offsettate' all'origine
        for (Coordinata c : coords) {
            sketch[dimy - 2 - c.y][c.x] = '#';
        }
        

        String output = "";
        
        for(int i = 0; i < dimx; i++){
            for(int j = 0;j < dimy; j++){
                output += sketch[i][j];
            }
            if(i != dimx-1) {output += "\n";}
        }
        
        return output;
    }
    
    
}