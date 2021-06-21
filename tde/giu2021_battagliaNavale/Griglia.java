public abstract class Griglia {
    private Coordinata[][] griglia;

    /**
     * Inizializza una griglia vuota (con '~')
     */
    public Griglia(){
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                Coordinata c = new Coordinata((char)(i + 'A'), j);
                System.out.println(c.toString());
                griglia[i][j] = c;
            }   
        }
    }

    public String toString(){
        String str = "";
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                str += griglia[i][j].getValore();
            }
            str += "\n";
        }
        return str;
    }

}
