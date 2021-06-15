//https://demo.hedgedoc.org/BQMKtSW4SJiue7jr-SXtQQ#

package Trasmissioni;

import java.util.Objects;

/**
 * Le istanze di questa classe rappresentano un betaorario.
 * Le istanze di questa classe sono immutabili, quindi è possibile 
 * dichiarare la variabili come publiv
 * ABS FUN: AF(betaore, betaminuti) -> this.betaore + ":" + this.betaminuti
 * REP INV: 0 <= Betaore <= 30, 0 <= betaminuti <= 79
 */
public class Betaorario implements Comparable<Betaorario> {
    public final int betaore;
    public final int betaminuti;

    /**
     * REQUIRES: 0 <= ore <= 30, 0 <= minuti <= 79
     * EFFECTS: Inizializza un nuovo betaorario.
     *          Se 0 <= ore <= 30, 0 <= minuti <= 79 
     * @param ore betaore
     * @param minuti betaminuti
     */
    public Betaorario(int ore, int minuti){
        if (ore > 30 || ore < 0 || minuti > 80 || minuti < 0)   
            throw new IllegalArgumentException("0 <= ore <= 30, 0 <= minuti <= 79\n");
        this.betaore = ore;
        this.betaminuti = minuti;
    }

    /**
     * REQUIRES: o != null
     * EFFECTS: restituisce un nuovo betaorario ottenuto da this + o
     *          solleva una eccezione se o è null
     * @param o orario da sommare
     * @return this + o
     */
    public Betaorario addBetaorario(Betaorario o){
        Objects.requireNonNull(o, "il betaorario non deve essere null");
        int newminuti = this.betaminuti + o.betaminuti;
        int newora = this.betaore + o.betaore;
        if (newminuti / 80 > 0){
            newora++;
            newminuti %= 80;
        }
        if (newora / 31 > 0)
            newora %= 31;

        return new Betaorario(newora, newminuti);
    }

    /**
     * REQUIRES: durata >= 0
     * EFFECTS: restituisce un nuovo betaorario ottenuto da this + durata (espressa in betaminuti)
     * @param durata durata da sommare
     * @return this + durata
     */
    public Betaorario addDurata(int durata){
        if (durata < 0) throw new IllegalArgumentException("durata deve essere positivo. Trovato: " + durata);
        int newminuti = (durata + this.betaminuti) % 80  ;
        int newora = (((durata + this.betaminuti) / 80 ) + this.betaore) % 31;
        return new Betaorario(newora, newminuti);
    }

    /**
     * REQUIRES: o != null
     * EFFECTS: confronta this con un altro betaoraraio.
     *          Solleva una eccezione se o == null
     * @param o betaorario da conforntare con this
     * @return 1 se this>o, 0 se this == o, -1 altrimenti
     */
    public int compareTo(Betaorario o){
        Objects.requireNonNull(o);
        if (this.betaore > o.betaore) return 1;
        if (this.betaore == o.betaore){
            if (this.betaminuti > o.betaminuti) return 1;
            else if (this.betaminuti == o.betaminuti) return 0;
            else return -1;
        }
        return -1;
    }

    @Override
    public String toString(){
        return this.betaore + ":" + this.betaminuti;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Betaorario)) return false;
        Betaorario o = (Betaorario) obj;
        if (this.betaore != o.betaore) return false;
        if (this.betaminuti != o.betaminuti) return false;
        return true;
    }
    
}
