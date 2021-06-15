package Trasmissioni;

import java.rmi.server.ObjID;
import java.util.Objects;

/**
 * Le istanze di questa classe rappresentano una trasimssione semplice
 * Le istanze di questa classe sono immutabili, quindi è possibile dichiaraare 
 * i suoi attributi come pubblici
 * 
 * ABS FUN:
 * REP INV:
 */

public class TrasmissioneSemplice implements Trasmissione {
    public final String titolo;
    public final FasciaOraria fasciaOraria;

    /**
     * 
     * @param titolo
     */
    public TrasmissioneSemplice(String titolo, FasciaOraria fascia){
        Objects.requireNonNull(titolo);
        Objects.requireNonNull(fascia);
        this.titolo = titolo;
        this.fasciaOraria = fascia;
    }

    public TrasmissioneSemplice(String titolo){
        Objects.requireNonNull(titolo);
        this.titolo = titolo;
        this.fasciaOraria = null;
    }

    /**
     * EFFECTS: restituisce true se obj.titolo == this.titolo
     * Se obj è null restituisce una eccezione
     * @param obj Trasmissione da confrontare
     * @return true se obj.titolo == this.titolo, false altrimenti
     */
    public boolean equalsTitolo(TrasmissioneSemplice obj){
        Objects.requireNonNull(obj);
        return this.titolo.equals(obj.titolo);
    }


    /**
     * EFFECTS: metodo dell'interfaccia Trasmissione. 
     *      Se obj è null solleva una eccezione.
     *      Se obj non è una istanza di trasmissioneSemplice solleva una eccezione 
     * @param obj Trasmissione da confrontare con this
     * @return true se this e obj si intersecano, false altrimenti
     */
    @Override
    public boolean interseca(Object obj) {
        Objects.requireNonNull(obj);
        if (!(obj instanceof TrasmissioneSemplice)) 
            throw new IllegalArgumentException("L'argomento deve essere una TrasmissioneSemplice");
        TrasmissioneSemplice o = (TrasmissioneSemplice) obj;
        return this.fasciaOraria.interseca(o.fasciaOraria);
    }

    @Override
    public String toString(){
        return this.titolo + ": " + fasciaOraria.toString();
    }

    
    // static class Compratatore implements Comparable<Trasmissione>{
    //     @Override
    //     public int compareTo(Trasmissione o){
    //         i
    //     }
    // }
}
