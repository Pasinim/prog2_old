import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
FUNZIONE ASTRAZIONE:
Rappresentazione di un rettangolo composto da celle.

La variabile bl rappresenta la cella in basso a sinistra (bottom-left).
La variabile tr rappresenta la cella in alto a destra (top right).

Siccome questo tipo di dato è immutabile è legittimo dichiarare le sue variabili pubbliche.
*/
public class Rettangolo {
    /*
    INVARIANTE DI RAPPRESENTAZIONE:
    
    bl e tr devono essere diversi da null
    */
    public final Coordinata bl;
    public final Coordinata tr;

    /*
    REQUIRES: bl e tr devono essere diversi da null
    MODIFIES: -
    EFFECTS: Se bl o tr sono null viene lanciato NullPointerException
    
             Inizializza questa istanza con una coordinata per bl ed una per tr
    */
    public Rettangolo(Coordinata bl, Coordinata tr){
        if(bl == null || tr == null) throw new NullPointerException("Nessuna delle due coordinate può essere null");
        this.bl = bl;
        this.tr = tr;
    }

    /*
    REQUIRES: L'insieme di coordinate coords non deve essere ne null ne vuoto
    MODIFIES: -
    EFFECTS: Se coords è null viene lanciato NullPointerException
             Se coords è vuoto viene lanciato IllegalArgumentException

             Le cordinate date in ingresso vengono separate in due liste (ascisse ed ordinate)
             che vengono poi ordinate in ordine crescente.
             Queto metodo ritorna un nuovo Rettangolo che avrà:
             bl individuato dai valori piu bassi delle due liste (indici 0)
             tr individuato dai valori piu alti delle due liste (indici size() - 1)
    */
    public static Rettangolo getBoundingBox(Set<Coordinata> coords){
        if(coords == null) throw new NullPointerException("la serie di coordinare non puo essere null");
        if(coords.size() == 0) throw new IllegalArgumentException("la serie di coordinate non puo essere vuota");
        
        List<Integer> ascisse = new ArrayList<Integer>();
        for (Coordinata c : coords) {
            ascisse.add(c.x);
        }
        List<Integer> ordinate = new ArrayList<Integer>();
        for (Coordinata c : coords) {
            ordinate.add(c.y);
        }

        ordinate.sort(null);
        ascisse.sort(null);

        Coordinata bl = new Coordinata(ascisse.get(0), ordinate.get(0));
        Coordinata tr = new Coordinata(ascisse.get(ascisse.size() - 1), ordinate.get(ordinate.size() - 1));

        return new Rettangolo(bl, tr);
    }

    /*
    REQUIRES: -
    MODIFIES: -
    EFFECTS: Ritorna una stringa che rappresenta lo stato di questa istanza
    */
    @Override
    public String toString(){
        return "["  + this.bl.toString() + ", "  +this.tr.toString() + "]";
    }
}