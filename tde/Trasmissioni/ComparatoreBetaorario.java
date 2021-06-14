package Trasmissioni;

import java.util.Comparator;
/**
 * Comparatore che confronta due betaorari.
 */

public class ComparatoreBetaorario implements Comparator<Betaorario> {

    @Override
    public int compare(Betaorario o1, Betaorario o2) {
        if (o1.betaore > o2.betaore) return 1;
        if (o1.betaore == o2.betaore){
            if (o1.betaminuti > o2.betaminuti) return 1;
            else if (o1.betaminuti == o2.betaminuti) return 0;
            else return -1;
        }
        return -1;
    }
}
