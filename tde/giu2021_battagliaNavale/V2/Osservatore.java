package giu2021_battagliaNavale.V2;
import java.util.*;

public class Osservatore {
    public final Giocatore g1;
    public final Giocatore g2;

    public Osservatore(){
        this.g1 = this.popolaGiocatore();
        this.g2 = this.popolaGiocatore();
    }

    //non deve essere fatto così, prende solo le navi e le posizioni
    public Giocatore popolaGiocatore(){
        Set<Nave> navi = new HashSet<>();
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        //popolo la lista
        String comandi[] = line.split(",");
        for (int i = 0; i < comandi.length; i++){
            Boolean verticale;
            String tokens[] = comandi[i].split(":");
            String tipo = tokens[0];
            String coord = tokens[1]; 
            String orienta = tokens[2];
            Coordinata c = new Coordinata((coord.charAt(1) - '0'), (coord.charAt(0) - 'A'));
            if (orienta.charAt(0) == 'V')
                verticale = true;
            else 
                verticale = false;
            Nave n = new Nave(getTipo(tipo.charAt(0)), verticale, c );
            navi.add(n);
        }
        input.close();
        return new Giocatore(navi);
    }

    public Tipo getTipo(char c){
            if (c != 'P' && c != 'S' && c != 'F' && c != 'C')
                throw new IllegalArgumentException();
            switch (c){
                case 'P':
                return Tipo.P;
                case 'C':
                return Tipo.C;
                case 'F':
                return Tipo.F;
                case 'S':
                return Tipo.S;
                default:
                return null;
            }
        }

    /**
     * Esegue una mossa in coordinata c per il giocatore g1, aggiornando di conseguenza
     * la griglia strategica
     * @param c Coordinata da attaccare sulla flotta di g2
     */
    public void mossa_g1(Coordinata c){
        g1.colpisci(c, g2.getGrigliaFlotta());
    }
    


    @Override
    public String toString(){
            return g1.toString();
        }
    public static void main(String[] args) {


    }

}
