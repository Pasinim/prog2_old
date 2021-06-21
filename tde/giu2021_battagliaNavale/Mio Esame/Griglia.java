/**
 * OVERVIEW: Le istanze di questa classe astratta rappresentano una Griglia di battaglia navale
 */

public abstract class Griglia {
    protected Coordinata[][] griglia;

    /**
     * EFFECTS: inizializza una nuova griglia di dimensione 10x10
     */
    public Griglia() {
        griglia = new Coordinata[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                griglia[i][j] = new Coordinata((char) (j + 'A'), i);
        }
    }
    
    
    /**
     * EFFECTS: aggiorna c.contiene con value 
     * @param c coordinata da modificare
     * @param value nuovo valore di c.contiene
     */
    public void modifica(Coordinata c, char value) {
        c.modificaValore(value);
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                str += griglia[i][j].toString();
            str += "\n";
        }
        return str;
    }
}