package giu2021_battagliaNavale.V2;
import java.util.*;
/**
 * Le istanze di questa classe rappresentano una nave, di tipo assegnato, 
 * identificata da un insieme di ordinate e da un orientamento.
 * Ogni nave può memorizzare i danni subiti e determinare se la nave è affondata.
 * RI:  danniSubiti <= tipo.numPosizioni
 *      Coordinate != null
 *      coordinate.size() = tipo.numPosizioni
 */


public class Nave {
    public final Tipo tipo;
    private int danniSubiti;
    private boolean affondata;
    public final boolean isVerticale;
    public List<Coordinata> coordinate; 

    public Nave (Tipo tipo, boolean isVerticale, Coordinata posIniziale){
        this.tipo = tipo;
        this.isVerticale = isVerticale;
        affondata = false;
        danniSubiti = 0;
        List<Coordinata> c = new ArrayList<Coordinata>();
        
        if (isVerticale)
            for (int i = 0; i < this.tipo.numPosizioni; i++)
                c.add(new Coordinata(posIniziale.r, posIniziale.c + i));
        else
            for (int i = 0; i < this.tipo.numPosizioni; i++)
                c.add(new Coordinata(posIniziale.r + i, posIniziale.c));

        coordinate = new ArrayList<Coordinata>(c);
    }

    public static void main(String[] args) {
        Nave n = new Nave(Tipo.C, true, new Coordinata(0, 0));

    }
}
