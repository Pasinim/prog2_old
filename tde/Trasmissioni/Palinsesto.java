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
    private List<Trasmissione> palinsesto;

    public Palinsesto(){
        palinsesto = new ArrayList<Trasmissione>();
    }

    public void aggiungi(String titolo, FasciaOraria fascia){
        for (int i = 0; i < palinsesto.size(); i++){
            TrasmissioneSemplice curr = new TrasmissioneSemplice(palinsesto.get(i).titolo, palinsesto.get(i).fasciaOraria);
            if (curr.titolo.equals(titolo)){
                System.out.println("adaadad" + idx);
                TrasmissioneSemplice nuova = new TrasmissioneSemplice(titolo, fascia);
                palinsesto.set(i, nuova);
                return;
            }
        }
        palinsesto.add(new TrasmissioneSemplice(titolo, fascia));
    }

    public String toString(){
        String str = "";
        for (Trasmissione t : palinsesto)
            str += t.toString() + "\n";
        return str;
    }


    // private Map<Trasmissione, List<FasciaOraria>> palinsesto;
    // List<FasciaOraria> fascia = new ArrayList<FasciaOraria>();

    // public Palinsesto(){
    //     palinsesto = new HashMap<Trasmissione, List<FasciaOraria>>();
    // }

    // /**
    //  * Aggiunge la trasmissione t e la fasciaoraria f. Se t è già presente aggiunge f 
    //  * alla lista delle fasce orarie associate a t
    //  * @param t Nome della trasmissione
    //  * @param f
    //  */
    // public void aggiungi(Trasmissione t, FasciaOraria f){
    //     if (!palinsesto.containsKey(t)){
    //         fascia.add(f);
    //         palinsesto.put(t, fascia);
    //     }else{
    //         fascia.add(f);
    //         palinsesto.put(t, fascia);
    //     }
    // }

}
