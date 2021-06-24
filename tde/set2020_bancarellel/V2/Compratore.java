package set2020_bancarellel.V2;
import java.util.*;
/**
 * 
 */
public abstract class Compratore {
    Set<Bancarella> bancarelle;
    public Compratore(Set<Bancarella> bancarelle ){
        Objects.requireNonNull(bancarelle);
        for(Bancarella b : bancarelle){
            Objects.requireNonNull(b);
        }
        this.bancarelle = bancarelle;
    }

    public abstract Acquisto compra(final int num, final Giocattolo giocattolo);

    public Iterator<Bancarella> bancarelleIterator(){
        Set<Bancarella> b = new HashSet<>(this.bancarelle);
        return b.iterator();
    }
}
