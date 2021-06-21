package giu2021_battagliaNavale;

/**
 * Questa classe astratta rappresenta una griglia di una partita di battaglia navale.
 * AF(griglia) = ????
 * RI: griglia != null, riga <= 10, colonna <= 10
 */
public abstract class Griglia {
    protected Coordinata[][] griglia = new Coordinata[10][10];

    /**
     * Inizializza una griglia vuota (con '~')
     */
    public Griglia(){
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++){
                Coordinata c = new Coordinata((char)(i + 'A'), j);
                griglia[i][j] = c;
            }
           if (!repOK()) 
            throw new IllegalArgumentException("IR non rispettato");
        }

    /**
     * Devo fare un metodo che vada bene sia per la griglia strategia che 
     * per quella della flotta. Posso fare un metodo che nella strategica
     * scrive '.' e '#' e nella flotta scrive i colpi subiti
     * 
     */
    public abstract void hit(Coordinata c);

    /**
     * Restituisce il valore della griglia in Coordinata c
     * @param c
     * @return
     */
    public abstract char getValore(Coordinata c);

    public String toString(){
        String str = "";
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++)
                str += griglia[i][j].getValore();
            str += "\n";
        }
        return str;
    }

    private boolean repOK(){
        int columns = griglia.length;
        int rows = griglia[0].length;
        return (griglia != null 
            && columns <= 10
            && rows <= 10);
    }

}
