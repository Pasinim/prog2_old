package set2020_bancarellel.V2;

import java.util.*;
/**
 * Le istanze di questa classe prendono una lista di Bancarelle
 * da cui acquistare il giocattolo
 */
public class CompratoreUnitario extends Compratore {

    public CompratoreUnitario(Set<Bancarella> bancarelle) {
        super(bancarelle);
    }

    /**
     * Queto metodo itera su tutte this.bancarelle e restituisce un 
     * acquisto
     */
    @Override
    public Acquisto compra(int num, Giocattolo giocattolo) {
        int prezzoTotale = 0;
        Iterator<Bancarella> it = super.bancarelleIterator();
        //itero sulle liste fin quando num = 0;
        Bancarella curr;
        int venduti = 0;
        while (it.hasNext()){
            curr = it.next();
            if (!(curr.inventario.contains(giocattolo)))
                continue;
            else{
                for (int i = 0; i < num; i++){
                    if (!(curr.inventario.contains(giocattolo))){
                        venduti += i - 1;
                        num = num - venduti;
                        break;
                    }
                    curr.vendi(giocattolo, 1);
                    bancarelle.add(curr);
                    prezzoTotale += curr.listino.getPrezzo(giocattolo);
                }
            }

        }
        Acquisto a = new Acquisto(giocattolo, this.bancarelle, venduti, prezzoTotale);
        return a;
    }
    
}
