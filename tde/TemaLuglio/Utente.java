import java.util.*;
/**
 * Le istanze di questa classe rappresentano un utente, identificato da
 * nome utente e password. Ogni utente possiede una lista di conversazioni
 * con altri utenti. 
 * AF(nome, psw, conversazioni) -> this.nome
 * RI:  nome, psw != null
 */

public class Utente {
   public final String nome;
   public final String psw;
   private Set<Conversazione> conversazioni;

   /**
    * Inizializza un nuovo utente. Se nome o psw sono null solleva una eccezione
    * @param nome Nome di this
    * @param psw Password di this
    */
   public Utente(String nome, String psw){
       Objects.requireNonNull(nome);
       Objects.requireNonNull(psw);
        this.nome = nome;
        this.psw = psw;
        conversazioni = new HashSet<>();
   }

   /**
    * Restituisce la conversazione tra this e u
    * @param u Utente con cui avviene la conversazione
    * @return Conversazione tra this e u
    */
   public Conversazione getConversazione(Utente u){
       Objects.requireNonNull(u);
        for (Conversazione c : conversazioni)
            if (c.interlocutore.equals(u))
                return c;
        throw new IllegalArgumentException("Utente " + u.toString() + "non trovato");
   }
   /**
    * Aggiunge il messaggio alla conversazione c
    * Se u non è presente negli interlocutori solleva una eccezione
    * @param u
    */
   public void ricevi(Conversazione c, Messaggio m){   
       c.ricevi(m);
   }

   public void invia(Messaggio m, Utente u){
        this.getConversazione(u).invia(m);
   }

   public void iniziaConversazione(Utente u){
       this.conversazioni.add(new Conversazione(u));
   }
   
   //riprendiConversazione(Utente u)

   @Override
   public String toString(){
       return this.nome;
   }

   @Override
   public boolean equals(Object obj){
       if (!(obj instanceof Utente)) return false;
       Utente o = (Utente) obj;
       if (!this.nome.equals(o.nome)) return false;
       if (!this.psw.equals(o.psw)) return false;
       return true;
   }

   @Override
   public int hashCode(){
        int res = 0;
        res += Integer.hashCode(this.nome.hashCode());
        res += Integer.hashCode(this.psw.hashCode());
        return res;
   }

   public static void main(String[] args) {
       Utente u = new Utente("ma", "x");
       Utente u2 = new Utente("pip", "y");
       u.iniziaConversazione(u2);
       Messaggio msg = new Messaggio(u, u2, "ciao", Tipo.M);
        u.invia(msg, u2);
        System.out.println(u.getConversazione(u2).toString());
   }
}
