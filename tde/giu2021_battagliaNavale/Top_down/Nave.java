package giu2021_battagliaNavale.Top_down;

public class Nave {
    public final Tipo tipo;
    public final Posizione start;
    public final boolean isVerticale;
    private int danniSubiti;
    private boolean affondata;

    public Nave(Tipo tipo, boolean isVerticale, Posizione start){
        this.affondata = false;
        this.danniSubiti = 0;
        this.tipo = tipo;
        this.isVerticale = isVerticale;
        this.start = start; 
    }

    /**
     * Incrementa il danno di this. Se la nave è già stata affondata
     * non modifica nulla, altrimenti incrementa il danno e setta affondata a true 
     * se la nave è stata effetticamente affondata
     */
    public void incrementaDanno(){
        if (affondata)
            return;
        this.danniSubiti++;
        if (danniSubiti == tipo.numPosizioni)
            affondata = true;
    }

    /**
     * @return true se this è stata affondata, false altrimenti
     */
    public boolean isAffondata(){   
        return this.affondata;
    }

    @Override
    public String toString(){
        return String.format("Nave: %s", this.tipo.name());
    }



}
