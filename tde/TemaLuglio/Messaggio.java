import java.util.*;
/**
 * Le istanze di questa classe rappresentano un Messaggio, 
 * identificato da mittente, destinatario, contenuto e il tipo del messaggio
 * Le istanze di questa classe sono immutabili.
 * AF:
 * IR:
 */
public class Messaggio {
   public final Utente mittente; 
   public final Utente destinatario;
   public final String contenuto;
   public final Tipo tipo;

   /**
    * Inizializza un nuovo messaggio inviato dall'utente mittente all'utente destinatario.
    * Nel caso uno deglia argomenti sia null solleva una eccezione
    * @param mittente Mittente di this
    * @param destinatario Destinatario di this 
    * @param contenuto Contenuto di this 
    * @param tipo Tipo di this 
    */
   public Messaggio(Utente mittente, Utente destinatario, String contenuto, Tipo tipo){
       Objects.requireNonNull(mittente);
       Objects.requireNonNull(destinatario);
       Objects.requireNonNull(contenuto);
       Objects.requireNonNull(tipo);
       this.mittente = mittente;
       this.destinatario = destinatario;
       this.contenuto = contenuto;
       this.tipo = tipo;
   }

   @Override
   public String toString(){
       String str = "";
       str = str + String.format("%s: [%s] %s", mittente.toString(), tipo.tipologia, contenuto );
       return str;
   }
}
