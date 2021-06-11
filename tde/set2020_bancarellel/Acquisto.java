package set2020_bancarellel;
import java.util.*;

/**
 * Overview: Le istanze di questa classe rappresentano un acquisto.
 * 
 * L'acquisto (di un determinato giocattolo) è pertanto caratterizzato da:
 * il giocattolo stesso, la quantità acquistata e il prezzo
 * pagato, nonché dall'elenco delle bancarelle, 
 * ciascuna accompagnata dal numero di giocattoli che ha venduto.
 */
public class Acquisto {

    private Giocattolo g; 
    private int quantita;
    private int prezzo;
    //Istanza di classe che rappresenta quale bancarella ha venduto
    //il giocattolo g e la quantita
    private Map <Bancarella, Integer> acquistato_da;

    /**
     * Inizializza un Acquisto. Se g è null oppure quant o prezzoTot sono negative
     * lancia una eccezione
     * @param g giocattolo da acquistare
     * @param quant quantita di giocattolo g da acquistare
     * @param prezzoTot prezzo che si è disposti a pagare per quant giocattoli g
     */
    public Acquisto(Giocattolo g,int quant, int prezzoTot){
        Objects.requireNonNull(g,"Il giocattolo g è null\n");
        if (quant < 0 || prezzoTot < 0) throw new IllegalArgumentException(
            "Quantità e prezzo devono essere valori positivi."
        );
        this.g = g;
        this.quantita = quant;
        this.prezzo = prezzoTot;
        acquistato_da = new HashMap<Bancarella, Integer>();
    }

    public Bancarella findGiocattolo(Giocattolo g){
        
    }

    @Override
    public String toString(){
        return g.toString() + ", numero: " + this.quantita	+ 
        " per un costo di: " + this.prezzo + "\n";  
    }


}
