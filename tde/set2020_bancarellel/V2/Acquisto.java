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
        super(ListaB);
        Objects.requireNonNull(g);
        giocattolo = g;
        bancarelle = ListaB;
        quantita = q;
        prezzoTotale = prezzo;
    }
    
    //devo rimuovere q giocattoli dal bancareella.inventario.
    @Override
    public Acquisto compra(int num, Giocattolo giocattolo) {
        for (Bancarella b : this.bancarelle){
            if (!(b.inventario.contains(giocattolo))) throw IllegalArgumentException();
            for ( ; num > 0; num--){
                b.inventario.rimuovi(giocattolo);
                if (!(b.inventario.contains(giocattolo))) break;

        }

        }
        return null;
    }






}
