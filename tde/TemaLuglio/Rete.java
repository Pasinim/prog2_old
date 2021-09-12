import java.util.*;

public class Rete{
    private List<Utente> utenti;
    
    public Rete(){
        utenti = new ArrayList<>();
    }

    public void registraUtente(Utente u){
        Objects.requireNonNull(u);
        if (utenti.contains(u))
            throw new IllegalArgumentException("Impossibile aggiungere utente, è già registrato");
        utenti.add(u);
    }

    /**
     * Autentica un utente. Se l'utente non è presente nella rete oppure la password è 
     * errata solleva una eccezione 
     * @param nome Nome utente 
     * @param psw Password dell'utente
     * @return Utente(nome, psw)
     */
    public Utente autentica(String nome, String psw){
        Utente u = new Utente(nome, psw);
        if (!(utenti.contains(u)))
            throw new IllegalArgumentException("Utente non registrato");
        Iterator<Utente> it = utenti.iterator();
        while (it.hasNext()){
            Utente curr = it.next();
            if (curr.equals(u))
                return curr;
        }
        throw new IllegalArgumentException("Passoword errata");
    }

    public static void main(String[] args) {
        Rete r = new Rete();
        Utente m = new Utente("merlino", "aa");
        r.registraUtente(m);
    }
}