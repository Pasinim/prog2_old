package giu2021_battagliaNavale.Top_down;

import java.util.*;

/**
 * L'osservatore svolge il suo ruolo ricevendo,
 * per ciascun giocatore, l'elenco di navi (con 
 * la rispettiva posizione) della sua flotta e 
 * l'elenco completo delle mosse che ha giocato. 
 * Con tali informazioni è in grado di produrre 
 * la sequenza delle quattro griglie di gioco 
 * (due per avversario)
 */
public class Osservatore {
   public final Giocatore g1;
   public final Giocatore g2;
   public final Set<Nave> flottaG1;
   public final Set<Nave> flottaG2;
   /**
    * Inizializza un nuovo osservatore con la flotta di entrambi 
    * i giocatori
    * @param flotta1 Flotta di g1
    * @param flotta2 Flotta di g22
    */
   public Osservatore(GrigliaFlotta f1, GrigliaFlotta f2){
       Objects.requireNonNull(f1);
       Objects.requireNonNull(f2);
       flottaG1 = new HashSet<>();
       flottaG2 = new HashSet<>();
       g1 = new Giocatore(f1, new GrigliaStrategica());
       g2 = new Giocatore(f2, new GrigliaStrategica());
   }

   private GrigliaFlotta aggiungiAFlotta(Set<Nave> navi){
        Iterator<Nave> it = navi.iterator();
        GrigliaFlotta g = new GrigliaFlotta();
        while (it.hasNext())
            g.aggiungiNave(it.next());
        return g;
   }
}
