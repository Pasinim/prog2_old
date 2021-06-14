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

public class TrasmissioneSemplice implements Trasmissione{
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


    // posso aggiungere una fascia oraria alla trasmissione? 
    // No pechè è semplice

    @Override
    public boolean interseca(Object obj) {
       
        return false;
    }

    @Override
    public String toString(){
        return this.titolo + ": " + fasciaOraria.toString();
    }
    
}
