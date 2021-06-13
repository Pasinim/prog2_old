package Trasmissioni;
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
    // posso aggiungere una fascia oraria alla trasmissione? 
    // No pechè è semplice

    @Override
    public boolean interseca(Object obj) {
       
        return false;
    }
    
}
