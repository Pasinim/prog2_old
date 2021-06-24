package set2020_bancarellel.V2;
import java.util.*;

public class Acquisto {
    public final Giocattolo giocattolo;
    public final Set<Bancarella> bancarelle;
    public final int quantita;
    public final int prezzoTotale;

    /**
     * REQUIRES: q > 0, q <= Bancarella.inventario.getQuantita(g), prezzo > 0
     * @param g
     * @param ListaB
     * @param q
     * @param prezzo
     */
    public Acquisto(Giocattolo g, Set<Bancarella> ListaB, int q, int prezzo){
        bancarelle = ListaB;
        Objects.requireNonNull(g);
        giocattolo = g;
        quantita = q;
        prezzoTotale = prezzo;
    }
    
    @Override
    public String toString(){
        String str = String.format("Aquisto di: %s, numero: %d, per un costo di: %d\n", giocattolo.toString(), quantita, prezzoTotale);
        return str;
    }






}
