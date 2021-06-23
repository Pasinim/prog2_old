package set2020_bancarellel.V2;

import java.util.Objects;

/**
 * Le istanze di questa classe rappresentano un giocattolo, identificato da un nome e da un materiale.
 * Le istanze di questa classe sono immutabili.
 * AF(nome, materiale) -> this.nome + "di" + this.materiale
 * RI: x
 */
public class Giocattolo {
    public final String nome;
    public final String materiale;
    /**
     * Inizializza un giocattolo con un certo nome e materiale.
     * Se nome o materiale sono null solleva una eccezione
     * @param nome Nome del giocattolo 
     * @param materiale Materiale del giocattolo
     */
    public Giocattolo(String nome, String materiale){
        Objects.requireNonNull(nome);
        Objects.requireNonNull(materiale);
        this.nome = nome;
        this.materiale = materiale;
    }

    @Override
    public String toString(){
        return String.format("%s di %s", this.nome, this.materiale);
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Giocattolo)) return false;
        Giocattolo o = (Giocattolo) obj;
        if (!(this.nome.equals(o.nome))) return false;
        if (!(this.materiale.equals(o.materiale))) return false;
        return true;
    }

    @Override
    //È necessario fare l'Override di hashcode perchè altrimenti il confronto delle chiavi nella mappa non funzionerebbe correttametne.
    //Il confronto delle chiavi non viene fatto con equals ma con hashcode
    public int hashCode(){
        int result = Integer.hashCode(this.nome.hashCode());
        result = 37 * result + Integer.hashCode(this.materiale.hashCode()); 
        return result   ;
    }
}
