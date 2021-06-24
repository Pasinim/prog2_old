package set2020_bancarellel.V2;

import java.util.*;

public class CompratoreUnitario extends Compratore {

    public CompratoreUnitario(Set<Bancarella> bancarelle) {
        super(bancarelle);
    }

    @Override
    public Acquisto compra(int num, Giocattolo giocattolo) {
        Iterator<Bancarella> it = super.bancarelleIterator();
        return null;
    }
    
}
