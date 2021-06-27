package gen2021_pianeti.Top_down;
import java.util.*;

/**
 Un sistema astronomico è una collezione di pianeti e stelle fisse. 
 Questo deve essere in grado di eseguire una simulazione (come quella di cui sopra)
 per un intervallo di tempo arbitrario (esprimibile come intero),
 e di calcolare l'energia totale del sistema nella configurazione in cui viene a trovarsi trascorso questo tempo.
 * 
 */


public class SistemaAstronomico {
   public final Set<CorpoCeleste> sistema;
   private int tempo; 

   public SistemaAstronomico(int tempo){
       this.sistema = new HashSet<CorpoCeleste>();
       this.tempo =  tempo;
   }

   public void aggiungiCorpo(CorpoCeleste c){
        if (sistema.contains(c))
            throw new IllegalArgumentException("corpo celeste già presente");
   }

   /**
    * Restituisce true se c è presente nel sistema. False altrimenti.
    * Se c è null solleva una eccezione
    * @param c corpo celeste
    */
   public boolean contains(CorpoCeleste c){
        Objects.requireNonNull(c);
       Iterator<CorpoCeleste> it = sistema.iterator();
        while (it.hasNext()){
            if (c.equals(it.next())) return true;
        }
        return false;
   }
}
