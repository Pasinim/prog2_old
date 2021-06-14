package Trasmissioni;

import java.util.*;
import java.util.HashMap;
import java.util.List;

/**
 * Classe che rappresenta un palinsesto giornaliero.
 * Ogni trasmissione può essere in uno o più fasce orarie
 * Le istanze di questa classe sono mutabili
 * 
 *  ABS FUN: AF(palinsesto) -> Per ogni i: Trasmissione[i] -> Fasciaoraria[x1], ..., Fasicaoraria[xn],
 * dove n è il numero di fasce orarie della trasmissione i 
 * REP INV: palinsesto != null
 * 
 */

public class Palinsesto {
    private Map<Trasmissione, List<FasciaOraria>> palinsesto;

    public Palinsesto(){
        palinsesto = new HashMap<Trasmissione, List<FasciaOraria>>();
    }

    // /**
    //  * Aggiunge la trasmissione t e la fasciaoraria f. Se t è già presente aggiunge f 
    //  * alla lista delle fasce orarie associate a t
    //  * @param t Nome della trasmissione
    //  * @param f
    //  */
    // public void aggiungi(Tramissione t, FasciaOraria f){

    // }

}
