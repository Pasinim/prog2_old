package giu2021_battagliaNavale.V3;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano una nave, di tipo assegnato, 
 * identificata da un insieme di ordinate e da un orientamento.
 * Ogni nave può memorizzare i danni subiti e determinare se la nave è affondata.
 * RI:  danniSubiti <= tipo.numPosizioni
 *      Coordinate != null
 *      coordinate.size() = tipo.numPosizioni
 *      
 */



public class Nave {
    public final Tipo tipo;
    private int danniSubiti;
    private boolean affondata;
    public final boolean isVerticale;
    public final Coordinata coordinataIniziale; 

    public Nave (Tipo tipo, boolean isVerticale, Coordinata posIniziale){
        this.tipo = tipo;
        this.isVerticale = isVerticale;
        affondata = false;
        danniSubiti = 0;
        coordinataIniziale = posIniziale;
       //coordinate = new ArrayList<Coordinata>(c);
        if (!repOK()) throw new IllegalArgumentException("IR non rispettato");
        }

    public void incrementaDanno(){
        this.danniSubiti++;
        if (danniSubiti == this.tipo.numPosizioni)
            affondata = true;
    }

    public boolean getAffondata(){
        return affondata;
    }

    private boolean repOK(){
        return (danniSubiti <= tipo.numPosizioni);
    }

    @Override
    public String toString(){
        String str = String.format("Nave %s: ", tipo.name());
        for (int i = 0; i < tipo.numPosizioni; i++)
            if (isVerticale)
                str += (coordinataIniziale.r + i) +  " " + coordinataIniziale.c;
        return str + " Danni subiti: " + this.danniSubiti + "\n";
    }
}


