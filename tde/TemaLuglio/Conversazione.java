import java.util.*;


public class Conversazione {
    public final Utente interlocutore;
    private List<Messaggio> ricevuti; //messaggi ricevuti da interlocutore
    private List<Messaggio> inviati; //messaggi inviati da interlocutore
    private int idxNonLetti; //con l'indice tengo traccia di fin dove i messaggi sono stati letti

    public Conversazione(Utente interlocutore){
        Objects.requireNonNull(interlocutore);
        this.interlocutore = interlocutore;
        inviati = new ArrayList<>();
        ricevuti = new ArrayList<>();

    }

    /**
     * Invia un messaggio m a this.interlocutore
     * @param m Messaggio da inviare
     */
    public void invia(Messaggio m){
        inviati.add(m);
        //this.interlocutore.ricevi(m, utente);
        //anche all'interlocutore devo salvare i messaggi
    }

    public void ricevi(Messaggio m){
        ricevuti.add(m);
    }

    public String toString(){
        String str = "Messaggi ricevuti: \n[ ";
        Iterator<Messaggio> it = ricevuti.iterator();
        while (it.hasNext())
            str += it.next() + "\n";

        str += "Messaggi Inviati: \n[ ";
        it = inviati.iterator();
        while (it.hasNext())
            str += it.next() + "\n";
        return str + " ]\n";
    }

    public static void main(String[] args) {
        
    }
}
